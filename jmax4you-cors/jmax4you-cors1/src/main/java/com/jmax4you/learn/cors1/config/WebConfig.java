package com.jmax4you.learn.cors1.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.OrderComparator;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author max.zheng
 * @date 2020-04-12 21:31
 */
@Configuration
public class WebConfig extends WebMvcConfigurationSupport {
    @Resource
    private CustomMethodArgumentResolver customMethodArgumentResolver;

    @Override
    protected void addArgumentResolvers(List<HandlerMethodArgumentResolver> argumentResolvers) {
        argumentResolvers.add(customMethodArgumentResolver);
        OrderComparator.sort(argumentResolvers);
//        Collections.sort(argumentResolvers,OrderComparator);
        // 注册Spring data jpa pageable的参数分解器
//        argumentResolvers.add(new PageableHandlerMethodArgumentResolver());
    }


}