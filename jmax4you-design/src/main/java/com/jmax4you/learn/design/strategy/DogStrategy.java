package com.jmax4you.learn.design.strategy;

import org.springframework.stereotype.Component;

/**
 * @author max.zheng
 * @date 2020-03-27 18:21
 */
@Component("dog")
public class DogStrategy extends HandlerStrategy {
    @Override
    public String name() {
        return "dog";
    }
}
