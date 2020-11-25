package com.p6.demo.review.law_of_demeter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 扫地僧 xshlxx@126.com
 * @since 2020/11/18
 */
public class Boss {

    public void commandCheckNumber(TeamLeader teamLeader) {

        // 模拟BOSS一页一页往下翻页，TeamLeader实时统计
        List<Course> courseList = new ArrayList<>();

        for (int i = 0; i < 20; i++) {

            courseList.add(new Course());
        }

        teamLeader.checkNumberOfCourses(courseList);
    }

    // 重载过后的方法
    public void commandCheckNumber2(TeamLeader teamLeader) {

        teamLeader.checkNumberOfCourses();
    }


    public static void main(String[] args) {

        Boss boss = new Boss();

        TeamLeader teamLeader = new TeamLeader();

        boss.commandCheckNumber(teamLeader);
    }
}
