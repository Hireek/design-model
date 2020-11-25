package com.p6.demo.review.law_of_demeter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 扫地僧 xshlxx@126.com
 * @since 2020/11/18
 */
public class TeamLeader {

    public void checkNumberOfCourses(List<Course> courseList) {

        System.out.println("目前已发布的课程数量是:" + courseList.size());
    }

    public void checkNumberOfCourses() {

        List<Course> courseList = new ArrayList<>();

        for (int i = 0; i < 20; i++) {

            courseList.add(new Course());
        }

        System.out.println("目前已发布的课程数量是:" + courseList);
    }
}
