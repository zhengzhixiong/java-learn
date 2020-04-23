package com.jmax4you.learn.design.strategy;

import javax.annotation.PostConstruct;

/**
 * 处理策略
 *
 * @author max.zheng
 * @date 2020-03-27 18:20
 */
public abstract class HandlerStrategy {
    /**
     * 在方法上加上注解@PostConstruct，保证Bean初始化前已经装配了属性（注：Bean初始化包括，实例化Bean，并装配Bean的属性（依赖注入））
     */
    @PostConstruct
    public void init() {
//        calculationDiscountAmount = this;
    }

    public abstract String name();
}
