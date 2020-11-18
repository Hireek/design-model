package com.p6.demo.review.law_of_demeter;

import java.util.List;

/**
 * @author 徐恩晗 xshlxx@126.com
 * @since 2020/11/18
 */
public class TeamLeader {

    public void checkNumberOfCourses(List<Course> courseList) {

        System.out.println("目前已发布的课程数量是:" + courseList.size());
    }
}
