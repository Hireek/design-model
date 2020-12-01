package com.p6.demo.design_model.builder.chain;

import lombok.Data;

/**
 * @author 徐恩晗 xshlxx@126.com
 * @since 2020/11/30
 */
@Data
public class Course {


    private String name;
    private String ppt;
    private String video;
    private String note;
    private String homework;


//    public String toString() {
//
//        return "course : " + name + ppt + video + note + homework;
//    }
}
