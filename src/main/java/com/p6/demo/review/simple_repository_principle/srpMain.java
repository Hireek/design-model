package com.p6.demo.review.simple_repository_principle;

/**
 * @author 徐恩晗 xshlxx@126.com
 * @since 2020/11/18
 */
public class srpMain {

    private void modifyUserInfo(String userName,String address) {

        userName = "tom";
        address = "changsha";
    }

    private void modifyUserInfo(String userName,String... fields) {

        userName = "tom";
//        address = "changsha";
    }

    private void modifyUserInfo(String userName,String address, boolean bool) {

        if (bool) {
            userName = "tom";

        }else {
            address = "chansgha";
        }
    }

    private void modifyUserName(String userName) {

        userName = "Tom";
    }

    private void modifyAddress(String address) {

        address = "changsha";
    }



    public static void main(String[] args) {

        LiveCourse liveCourse = new LiveCourse();
        liveCourse.study("直播课");

        ReplayCourse replayCourse = new ReplayCourse();
        replayCourse.study("录播课");
    }
}
