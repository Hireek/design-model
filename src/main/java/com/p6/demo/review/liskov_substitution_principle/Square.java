package com.p6.demo.review.liskov_substitution_principle;

import lombok.Data;

/**
 * @author 徐恩晗 xshlxx@126.com
 * @since 2020/11/18
 */
@Data
public class  Square extends Rectangle{

    private long length;


    @Override
    public long getHeight() {
        return getLength();
    }

    @Override
    public long getWidth() {
        return getLength();
    }

    @Override
    public void setHeight(long height) {
        setLength(height);
    }

    @Override
    public void setWidth(long width) {
        setLength(width);
    }
}
