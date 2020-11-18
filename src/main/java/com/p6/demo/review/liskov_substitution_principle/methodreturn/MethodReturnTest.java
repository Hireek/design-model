package com.p6.demo.review.liskov_substitution_principle.methodreturn;

/**
 * @author 徐恩晗 xshlxx@126.com
 * @since 2020/11/18
 */
public class MethodReturnTest {

    public static void main(String[] args) {

        Base child = new Child();

        System.out.println(child.method());
    }
}
