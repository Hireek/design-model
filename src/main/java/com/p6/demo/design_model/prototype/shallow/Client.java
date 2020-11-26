package com.p6.demo.design_model.prototype.shallow;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 徐恩晗 xshlxx@126.com
 * @since 2020/11/26
 */
public class Client {

    public static void main(String[] args) {

        ConcretePrototype prototype = new ConcretePrototype();

        prototype.setAge(18);
        prototype.setName("Tom");

        List<String> lists = new ArrayList<>();

        lists.add("篮球");
        lists.add("美术");

        prototype.setHobbits(lists);


        // 拷贝原型对象
        ConcretePrototype cloneType = prototype.clone();

        cloneType.getHobbits().add("托马斯");

        System.out.println("这是克隆对象:" +cloneType);
        System.out.println("这是原型对象:" + prototype);

        System.out.println(prototype == cloneType);
    }
}
