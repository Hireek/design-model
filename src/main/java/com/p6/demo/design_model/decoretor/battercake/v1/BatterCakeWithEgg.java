package com.p6.demo.design_model.decoretor.battercake.v1;

/**
 * @author 徐恩晗 xshlxx@126.com
 * @since 2020/12/7
 */
public class BatterCakeWithEgg  extends BatterCake{


    protected String getMsg() {

        return super.getMsg() + " + 一个鸡蛋";
    }

    protected int getPrice() {
        return super.getPrice() + 2;
    }


}
