package com.p6.demo.current.example;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 徐恩晗 xshlxx@126.com
 * @since 2020/12/20
 */
public class Allocator {

    private List<Object> list = new ArrayList<>();

    synchronized boolean apply(Object from,Object to) {

        if (list.contains(from) || list.contains(to)) {

            return false;
        }

        list.add(from);
        list.add(to);

        return true;
    }

    synchronized void free(Object from, Object to) {

        list.remove(from);
        list.remove(to);
    }

}
