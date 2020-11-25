package com.p6.demo.review.simple_repository_principle;

/**
 * @author 扫地僧 xshlxx@126.com
 * @since 2020/11/18
 */
public interface ICourse {

    // 获取课程名称
    String getCourseName();

    // 获得视频流
    byte[] getCourseVideo();

    // 学习课程
    void studyCourse();

    // 退款
    void refundCourse();
}
