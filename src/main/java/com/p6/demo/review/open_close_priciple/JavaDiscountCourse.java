package com.p6.demo.review.open_close_priciple;

/**
 * @author 徐恩晗 xshlxx@126.com
 * @since 2020/11/16
 */
public class JavaDiscountCourse extends JavaCourse{

    public JavaDiscountCourse(Integer id, String name, Double price) {
        super(id, name, price);
    }

    public Double getOriginPrice() {

        return super.getPrice();
    }

    @Override
    public Double getPrice() {

        return super.getPrice() * 0.61;
    }
}
