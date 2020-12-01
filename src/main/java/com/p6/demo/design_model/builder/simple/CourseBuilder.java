package com.p6.demo.design_model.builder.simple;

/**
 * @author 徐恩晗 xshlxx@126.com
 * @since 2020/11/30
 */
public class CourseBuilder {


    private Course course = new Course();

    public void addName(String name) {

        course.setName(name);
    }

    public void addPpt(String ppt) {

        course.setPpt(ppt);
    }

    public void addVideo(String video) {

        course.setVideo(video);
    }

    public void addNote(String note) {

        course.setNote(note);
    }

    public void addHomework(String homework) {

        course.setHomework(homework);
    }

    public Course build() {

        return course;
    }
}
