package com.p6.demo.design_model.decoretor.battercake.v2;

/**
 * @author 徐恩晗 xshlxx@126.com
 * @since 2020/12/7
 */
public class BatterCakeDecorator extends BatterCake{


    private BatterCake batterCake;

    public BatterCakeDecorator(BatterCake batterCake) {

        this.batterCake = batterCake;
    }

    @Override
    protected String getMsg() {
        return this.batterCake.getMsg();
    }

    @Override
    protected int getPrice() {
        return this.batterCake.getPrice();
    }
}
