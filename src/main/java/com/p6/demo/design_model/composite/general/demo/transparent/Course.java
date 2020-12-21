package com.p6.demo.design_model.composite.general.demo.transparent;

import lombok.Data;

/**
 * @author 徐恩晗 xshlxx@126.com
 * @since 2020/12/15
 */
@Data
public class Course extends CourseComponent{

    private String name;

    private double price;


    public Course(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public void addChild(CourseComponent component) {
        super.addChild(component);
    }

    @Override
    public void removeChild(CourseComponent component) {
        super.removeChild(component);
    }

    @Override
    public String getName(CourseComponent component) {
        return this.name;
    }

    @Override
    public double getPrice(CourseComponent component) {
        return this.price;
    }

    @Override
    public void print() {
        System.out.println(name + "（￥" + price + "元)");
    }
}
