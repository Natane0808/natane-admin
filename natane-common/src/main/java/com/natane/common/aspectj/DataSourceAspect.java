package com.natane.common.aspectj;

import com.natane.common.annotation.DataSource;
import com.natane.common.datasource.DataSourceContextHolder;
import com.natane.common.utils.StringUtils;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Objects;

/**
 * 多数据源处理
 *
 * @author natabe
 * @date 2022/6/25
 */
@Aspect
@Order(1)
@Component
@EnableAspectJAutoProxy
public class DataSourceAspect {

    private final static Logger logger = LoggerFactory.getLogger(DataSourceAspect.class);

    @Pointcut("@annotation(com.natane.common.annotation.DataSource)"
            + "|| @within(com.natane.common.annotation.DataSource)"
            + "|| within(io.mybatis.service.AbstractService)")
    public void dsPointCut() {

    }

    @Around("dsPointCut()")
    public Object around(ProceedingJoinPoint point) throws Throwable {
        DataSource dataSource = getDataSource(point);

        if (StringUtils.isNotNull(dataSource)) {
            DataSourceContextHolder.setDataSourceType(dataSource.value().name());
        }

        try {
            return point.proceed();
        } finally {
            // 销毁数据源 在执行方法之后
            DataSourceContextHolder.clearDataSourceType();
        }
    }

    /**
     * 获取需要切换的数据源
     */
    public DataSource getDataSource(ProceedingJoinPoint point) {
        DataSource dataSource = AnnotationUtils.findAnnotation(point.getTarget().getClass(), DataSource.class);
        if (Objects.nonNull(dataSource)) {
            return dataSource;
        }

        return AnnotationUtils.findAnnotation(point.getTarget().getClass(), DataSource.class);
    }
}
