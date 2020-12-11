package com.p6.demo.current.listbean;

import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

/**
 * @Author: Chord
 * @Date: 2020/12/11 2:25 下午
 */
@Service
public class BtestDemoService implements DemoService {
    @Override
    public List<Integer> getNameList() {
        return Collections.singletonList(DemoNameEnum.B.getCode());
    }

    @Override
    public void execute(String name) {
        System.out.println(name);
    }
}
