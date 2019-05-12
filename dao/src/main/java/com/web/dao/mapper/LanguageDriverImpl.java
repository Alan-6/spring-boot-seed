package com.web.dao.mapper;

import org.apache.ibatis.executor.parameter.ParameterHandler;
import org.apache.ibatis.mapping.BoundSql;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.mapping.SqlSource;
import org.apache.ibatis.parsing.XNode;
import org.apache.ibatis.scripting.LanguageDriver;
import org.apache.ibatis.session.Configuration;

/**
 * @author LuHailun
 * @Title: LanguageDriverImpl
 * @ProjectName seed
 * @Description: TODO
 * @date 2019/5/12 17:58
 */
public class LanguageDriverImpl implements LanguageDriver {

    public ParameterHandler createParameterHandler(MappedStatement mappedStatement, Object o, BoundSql boundSql) {
        return null;
    }

    public SqlSource createSqlSource(Configuration configuration, XNode xNode, Class<?> aClass) {
        return null;
    }

    public SqlSource createSqlSource(Configuration configuration, String s, Class<?> aClass) {
        return null;
    }
}
