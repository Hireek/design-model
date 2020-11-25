package com.p6.demo.review.liskov_substitution_principle;

/**
 * @author 扫地僧 xshlxx@126.com
 * @since 2020/11/18
 */
public class Rectangle2 implements Quadrilateral{

    private long height;

    private long width;

    @Override
    public long getWidth() {
        return 0;
    }

    @Override
    public long getHeight() {
        return 0;
    }
}
