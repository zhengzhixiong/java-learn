package com.jmax4you.learn.cors1.config;/**
 * 支持form和json格式
 *
 * @author max.zheng
 * @date 2020-04-12 21:27
 */

import java.lang.annotation.*;

/**
 * 支持form和json格式
 * @author max.zheng
 * @date 2020-04-12 21:27
 *
 */
@Target(ElementType.PARAMETER)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface CustomRequest {
}
