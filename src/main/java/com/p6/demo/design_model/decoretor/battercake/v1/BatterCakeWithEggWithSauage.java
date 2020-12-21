package com.p6.demo.design_model.decoretor.battercake.v1;

/**
 * @author 扫地僧 xshlxx@126.com
 * @since 2020/12/7
 */
public class BatterCakeWithEggWithSauage extends BatterCakeWithEgg{


    protected String getMsg() {

        return super.getMsg() + " + 一根香肠";
    }

    protected int getPrice() {
        return super.getPrice() + 3;
    }


}
