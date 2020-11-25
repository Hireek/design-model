package com.p6.demo.review.liskov_substitution_principle.methodparam;

import java.util.HashMap;

/**
 * @author 扫地僧 xshlxx@126.com
 * @since 2020/11/18
 */
public class Base {

    public void method(HashMap map) {

        System.out.println("父类执行");
    }

}
