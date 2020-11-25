package com.p6.demo.review.liskov_substitution_principle.methodreturn;

import java.util.HashMap;

/**
 * @author 扫地僧 xshlxx@126.com
 * @since 2020/11/18
 */
public class Child extends Base{

    @Override
    public HashMap method() {

        HashMap hashMap = new HashMap();

        System.out.println("执行子类的method()");

        hashMap.put("msg","子类method()");
        return hashMap;
    }
}
