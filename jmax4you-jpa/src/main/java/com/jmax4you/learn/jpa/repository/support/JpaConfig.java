package com.jmax4you.learn.jpa.repository.support;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * 自定义的jpa实现配置
 *
 * @author max.zheng
 * @date 2018-05-03 20:35
 */
@Configuration
@EnableJpaRepositories(basePackages = { "com.jmax4you.**.dao" },
        repositoryFactoryBeanClass = BaseRepositoryFactoryBean.class)
@EntityScan("com.jmax4you.**.model")
public class JpaConfig {

}
