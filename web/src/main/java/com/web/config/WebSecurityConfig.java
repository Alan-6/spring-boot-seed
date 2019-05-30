package com.web.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * @author LuHailun
 * @Title: WebSecurityConfig
 * @ProjectName seed
 * @Description: TODO
 * @date 2019/5/27 21:27
 */
@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    UserDetailsService userDetailsService;

    @Autowired
    MyAuthenctiationFailureHandler myAuthenctiationFailureHandler;

    @Autowired
    MyAuthenticationSuccessHandler myAuthenticationSuccessHandler;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .csrf().disable().cors()                                                                 // 跨域支持
                .and()
                .authorizeRequests()
                .antMatchers("/role/**").authenticated()
                .antMatchers("/user/**").authenticated()
                .antMatchers("/permission/**").authenticated()
                .antMatchers("/swagger-ui.html", "/swagger-ui.html?/**").authenticated()
                .anyRequest().permitAll()
                .and()
                .formLogin()
                .loginPage("/user/login")                                                                 // 配置之后不会生产login页面，依然可以给该url发送登录信息
                .successHandler(myAuthenticationSuccessHandler)
                .failureHandler(myAuthenctiationFailureHandler)
                .and()
                .logout()
                .logoutSuccessUrl("/login");
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailsService).passwordEncoder(new BCryptPasswordEncoder());
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
