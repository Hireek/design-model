package com.p6.demo.review.liskov_substitution_principle;

import lombok.Data;

/**
 * @author 扫地僧 xshlxx@126.com
 * @since 2020/11/18
 */
@Data
public class Square2 implements Quadrilateral{


    private long length;



    @Override
    public long getWidth() {
        return length;
    }

    @Override
    public long getHeight() {
        return length;
    }
}
