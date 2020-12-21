package com.p6.demo.design_model.builder;

import lombok.Data;

/**
 * @author 扫地僧 xshlxx@126.com
 * @since 2020/11/30
 */
@Data
public class Product {

    private String name;

    @Override
    public String toString() {

        return "product  name=" + name;
    }
}
