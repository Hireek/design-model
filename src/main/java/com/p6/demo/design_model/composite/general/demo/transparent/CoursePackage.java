package com.p6.demo.design_model.composite.general.demo.transparent;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 扫地僧 xshlxx@126.com
 * @since 2020/12/15
 */
public class CoursePackage extends CourseComponent{


    private List<CourseComponent> items = new ArrayList<>();

    private String name;

    private Integer level;

    public CoursePackage(String name, Integer level) {
        this.name = name;
        this.level = level;
    }

    @Override
    public void addChild(CourseComponent component) {
        items.add(component);
    }

    @Override
    public void removeChild(CourseComponent component) {

        items.remove(component);
    }

    @Override
    public String getName(CourseComponent component) {
        return this.name;
    }


    @Override
    public void print() {

        System.out.println(this.name);

        for (CourseComponent c : items) {

            if (this.level != null) {

            }

        }
    }
}
