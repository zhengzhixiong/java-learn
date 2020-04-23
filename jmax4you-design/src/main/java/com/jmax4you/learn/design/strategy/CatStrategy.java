package com.jmax4you.learn.design.strategy;

import org.springframework.stereotype.Component;

/**
 * 猫策略
 *
 * @author max.zheng
 * @date 2020-03-27 18:20
 */
@Component("cat")
public class CatStrategy extends HandlerStrategy {
    @Override
    public String name() {
        return "cat";
    }
}
