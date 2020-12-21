package com.p6.demo.design_model.decoretor.battercake.v2;

/**
 * @author 扫地僧 xshlxx@126.com
 * @since 2020/12/7
 */
public class Test {

    public static void main(String[] args) {

        BatterCake batterCake;

        batterCake = new BaseBatterCake();

        batterCake = new EggDecorator(batterCake);

        batterCake = new EggDecorator(batterCake);

        batterCake = new SausageDecorator(batterCake);

        System.out.println(batterCake.getMsg() + ", 总价" + batterCake.getPrice());
    }
}
