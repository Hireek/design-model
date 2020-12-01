package com.p6.demo.design_model.factory.abstractFactory.Factory;

/**
 * @Author: Chord
 * @Date: 2020/11/27 4:44 下午
 */
public class FactoryBuilder {
    public static AbstractFactory getFactory(String type){
        if("note".equalsIgnoreCase(type)){
            return new NoteFactory();
        } else if ("video".equalsIgnoreCase(type)) {
            return new VideoFactory();
        } else {
            return null;
        }
    }
}
