package com.p6.demo.design_model.decoretor.battercake.logger;

import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;

/**
 * @author 徐恩晗 xshlxx@126.com
 * @since 2020/12/7
 */
@Slf4j
public class JsonLogger extends LoggerDecorator{

    public JsonLogger(Logger logger) {
        super(logger);
    }

    @Override
    public void error(String s) {
        super.error(s);
    }

    public void error(Exception e) {

        JSONObject result = newJsonObject();

        result.put("exception",e.getClass().getName());
        log.info(result.toString());

    }

    private JSONObject newJsonObject() {

        return newJsonObject();
    }

    @Override
    public void info(String s) {

        JSONObject result = newJsonObject();

        result.put("message",s);
        log.info(result.toString());

    }

}
