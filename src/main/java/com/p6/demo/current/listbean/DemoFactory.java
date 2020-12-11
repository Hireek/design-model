package com.p6.demo.current.listbean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Author: Chord
 * @Date: 2020/12/11 2:23 下午
 */
@Component
public class DemoFactory {
    @Autowired
    private List<DemoService> demoServiceList;
    
    public void execute(String name) {
        demoServiceList.stream().filter(demoService -> demoService.getNameList().contains(name)).findFirst().get()
                .execute(name);
    }
}
