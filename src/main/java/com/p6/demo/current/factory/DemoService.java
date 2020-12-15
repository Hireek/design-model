package com.p6.demo.current.factory;

import java.util.List;

/**
 * @Author: Chord
 * @Date: 2020/12/11 2:23 下午
 * @Description: 接口里存各种业务入口
 */
public interface DemoService {
    List<Integer> getNameList();

    /**
     * 业务入口
     * @param name 请求参数
     */
    void bussinessStart(String name);
}
