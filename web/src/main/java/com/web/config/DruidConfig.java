package com.web.config;

import com.alibaba.druid.filter.Filter;
import com.alibaba.druid.filter.stat.StatFilter;
import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

/**
 * @author LuHailun
 * @Title: DruidConfig
 * @ProjectName seed
 * @Description: TODO
 * @date 2019/5/18 11:05
 */
@Configuration
public class DruidConfig {

    // 读取配置文件前缀为preifx的配置
    @ConfigurationProperties(prefix = "spring.druid")
    // 容器的开启和关闭
    @Bean(initMethod = "init", destroyMethod = "close")
    public DruidDataSource dataSource() {
        List<Filter> filters = new ArrayList<Filter>();
        filters.add(myStatFilter());
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setProxyFilters(filters);
        return dataSource;
    }

    // 监控慢查询
    @Bean
    public Filter myStatFilter() {
        StatFilter statFilter = new StatFilter();
        // 定义1秒以上为慢查询
        statFilter.setSlowSqlMillis(1000);
        // 打印慢查询日志
        statFilter.setLogSlowSql(true);
        statFilter.setMergeSql(true);
        return statFilter;
    }

    // 配置druid监控
    @Bean
    public ServletRegistrationBean servletRegistrationBean() {
        return new ServletRegistrationBean(new StatViewServlet(), "/druid/*");
    }
}
