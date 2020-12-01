package com.p6.demo.design_model.builder;

/**
 * @author 徐恩晗 xshlxx@126.com
 * @since 2020/11/30
 */
public class ConcreteBuilder implements IBuilder{

    private Product product = new Product();

    @Override
    public Product build() {
        return product;
    }
}
