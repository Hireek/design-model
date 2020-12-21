package com.p6.demo.design_model.decoretor.battercake.v2;

/**
 * @author 扫地僧 xshlxx@126.com
 * @since 2020/12/7
 */
public class EggDecorator extends BatterCakeDecorator{



    public EggDecorator(BatterCake batterCake) {

        super(batterCake);
    }

    @Override
    protected String getMsg() {
        return super.getMsg() + " 1个鸡蛋";
    }

    @Override
    protected int getPrice() {
        return super.getPrice() + 1;
    }


}
