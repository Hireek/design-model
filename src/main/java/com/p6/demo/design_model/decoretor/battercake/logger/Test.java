package com.p6.demo.design_model.decoretor.battercake.logger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author 徐恩晗 xshlxx@126.com
 * @since 2020/12/7
 */
public class Test {

    private static final Logger logger = LoggerFactory.getLogger(Test.class);

    public static void main(String[] args) {


        logger.error("系统错误");
    }
}
