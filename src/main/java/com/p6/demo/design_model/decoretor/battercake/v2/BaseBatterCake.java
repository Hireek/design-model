package com.p6.demo.design_model.decoretor.battercake.v2;

/**
 * @author 徐恩晗 xshlxx@126.com
 * @since 2020/12/7
 */
public class BaseBatterCake extends BatterCake{

    @Override
    protected String getMsg() {
        return "煎饼";
    }

    @Override
    protected int getPrice() {
        return 5;
    }
}
