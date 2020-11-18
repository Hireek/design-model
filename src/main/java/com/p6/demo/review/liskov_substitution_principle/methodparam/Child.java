package com.p6.demo.review.liskov_substitution_principle.methodparam;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 徐恩晗 xshlxx@126.com
 * @since 2020/11/18
 */
public class Child extends Base{

//    @Override
//    public void method(HashMap map) {
//
//        System.out.println("子类HashMap入参方法执行");
//    }

    public void method(Map map) {

        System.out.println("子类Map的入参方法执行");
    }
}
