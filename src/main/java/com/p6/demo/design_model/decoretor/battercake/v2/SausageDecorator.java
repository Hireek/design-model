package com.p6.demo.design_model.decoretor.battercake.v2;

/**
 * @author 徐恩晗 xshlxx@126.com
 * @since 2020/12/7
 */
public class SausageDecorator extends BatterCakeDecorator{



    public SausageDecorator(BatterCake batterCake) {

        super(batterCake);
    }

    @Override
    protected String getMsg() {
        return super.getMsg() + " 1根香肠";
    }

    @Override
    protected int getPrice() {
        return super.getPrice() + 2;
    }


}
