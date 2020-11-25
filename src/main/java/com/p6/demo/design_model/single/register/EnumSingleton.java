package com.p6.demo.design_model.single.register;

/**
 * @author 徐恩晗 xshlxx@126.com
 * @since 2020/11/24
 */
public enum EnumSingleton {

    INSTANCE;

    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static EnumSingleton getInstance() {

        return INSTANCE;
    }

}
