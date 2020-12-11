package com.p6.demo.current.listbean;

import java.util.List;

/**
 * @Author: Chord
 * @Date: 2020/12/11 2:23 下午
 */
public interface DemoService {
    List<String> getNameList();
    void execute(String name);
}
