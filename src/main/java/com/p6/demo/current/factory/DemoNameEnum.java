package com.p6.demo.current.factory;

/**
 * @Author: Chord
 * @Date: 2020/12/11 2:31 下午
 */
public enum DemoNameEnum {
    A(1, "A"),
    B(2, "B");
    private String name;
    private int code;

    DemoNameEnum(int code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getCode() {
        return code;
    }

    public static DemoNameEnum getEnum(int code) {
        for(DemoNameEnum nameEnum: DemoNameEnum.values()) {
            if (nameEnum.getCode() == code) {
                return nameEnum;
            }
        }
        return null;
    }
}
