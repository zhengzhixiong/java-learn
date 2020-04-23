package com.jmax4you.learn.design.factory;

import com.jmax4you.learn.design.strategy.HandlerStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author max.zheng
 * @date 2020-03-27 18:02
 */
@Component
public class AnimalImpl implements Animal {
    @Autowired
    private final Map<String, HandlerStrategy> handlerStrategyMap = new ConcurrentHashMap<>();

    public AnimalImpl(Map<String, HandlerStrategy> strategyMap) {
        this.handlerStrategyMap.clear();
        strategyMap.forEach((k, v)-> this.handlerStrategyMap.put(k, v));
    }



    @Override
    public String eat() {
        return "eating......";
    }

    @Override
    public String name(String type) {
        return handlerStrategyMap.get(type).name();
    }

}
