package com.p6.demo.review.liskov_substitution_principle.methodparam;

import java.util.HashMap;

/**
 * @author 徐恩晗 xshlxx@126.com
 * @since 2020/11/18
 */
public class MethodParamTest {

    public static void main(String[] args) {


        Child child = new Child();

        HashMap hashMap = new HashMap();

        child.method(hashMap);

    }

}
