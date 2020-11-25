package com.p6.demo.review.interface_segregation_principle;

/**
 * @author 扫地僧 xshlxx@126.com
 * @since 2020/11/18
 */
public class Dog implements ISwimAnimal,IEatAnimal{

    @Override
    public void eat() {

    }

    @Override
    public void swim() {

    }
}
