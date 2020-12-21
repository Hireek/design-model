package com.p6.demo.design_model.decoretor.battercake.v1;

/**
 * @author 徐恩晗 xshlxx@126.com
 * @since 2020/12/7
 */
public class Test {

    public static void main(String[] args) {


        BatterCake cake = new BatterCake();

        System.out.println(cake.getMsg() + "，总价 " + cake.getPrice());


        BatterCakeWithEgg egg = new BatterCakeWithEgg();

        System.out.println(egg.getMsg() + "，总价 " + egg.getPrice());

        BatterCakeWithEggWithSauage sauage = new BatterCakeWithEggWithSauage();

        System.out.println(sauage.getMsg() + "，总价 " + sauage.getPrice());
    }
}
