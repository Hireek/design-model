package com.p6.demo.design_model.flyweight.jdk;

/**
 * @author 徐恩晗 xshlxx@126.com
 * @since 2020/12/10
 */
public class StringTest {

    public static void main(String[] args) {

        String s1 = "hello";
        String s2 = "hello";
        String s3 = "he" + "llo";
        String s4 = "hel" + new String("lo");
        String s5 = new String("hello");
        String s6 = s5.intern();
        String s7 = "h";
        String s8 = "ello";

        String s9 = s7 + s8;

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1 == s4);
        System.out.println(s1 == s5);
        System.out.println(s4 == s5);
        System.out.println(s1 == s6);

        System.out.println("：：：s1：" + s1.intern());
        System.out.println("：：：s1：" + s5.intern());
        System.out.println("：：：s6：" + s6.intern());
        System.out.println(s1 == s9);

        // 在编译期间只要是变量就不会优化
        //        System.out.println(s1 == s2); // true
//        System.out.println(s1 == s3); // true
//        System.out.println(s1 == s4); // false
//        System.out.println(s1 == s5); // false
//        System.out.println(s4 == s5); // false
//        System.out.println(s1 == s6); // true
//        System.out.println(s1 == s9); // false
    }
}
