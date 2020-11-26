package com.p6.demo.design_model.prototype.shallow;

import lombok.Data;

import java.util.List;

/**
 * @author 徐恩晗 xshlxx@126.com
 * @since 2020/11/26
 */
@Data
public class ConcretePrototype implements Cloneable {

    private int age;
    private String name;
    private List<String> hobbits;


    @Override
    public ConcretePrototype clone() {

        try {
            return (ConcretePrototype) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
}
