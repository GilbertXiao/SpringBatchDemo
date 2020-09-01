package com.gilxyj.core;

import com.gilxyj.config.SpringConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @program: springbatch
 * @description:
 * @作者 飞码录
 * @微信公众号 飞码录
 * @网站 http://www.codesboy.cn
 * @国际站 http://www.codesboy.com
 * @微信 gilbertxy
 * @GitHub https://github.com/GilbertXiao
 * @Gitee https://gitee.com/gilbertxiao
 * @create: 2020-09-02 04:52
 **/
public abstract class SpringContainer {

    private static final ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);

    public static ApplicationContext getApplicationContext() {
        return applicationContext;
    }
}
