package com.p6.demo.design_model.composite.general.demo.transparent;

/**
 * @author 扫地僧 xshlxx@126.com
 * @since 2020/12/15
 */
public abstract class CourseComponent {


    public void addChild(CourseComponent component) {
        throw new UnsupportedOperationException("不支持添加操作");
    }

    public void removeChild(CourseComponent component) {
        throw new UnsupportedOperationException("不支持删除操作");
    }

    public String getName(CourseComponent component) {
        throw new UnsupportedOperationException("不支持获取名称操作");
    }

    public double getPrice(CourseComponent component) {
        throw new UnsupportedOperationException("不支持获取价格操作");
    }

    public void print() {
        throw new UnsupportedOperationException("不支持打印操作");
    }

}
