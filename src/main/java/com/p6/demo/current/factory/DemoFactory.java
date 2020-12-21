package com.p6.demo.current.factory;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Author: Chord
 * @Date: 2020/12/11 2:23 下午
 */
@Slf4j
@Component
public class DemoFactory {
    @Autowired
    private List<DemoService> demoServiceList;
    
    public void execute(int code) {

        DemoNameEnum nameEnum = DemoNameEnum.getEnum(code);
        if (null == nameEnum) {
            return;
        } else {
            demoServiceList.stream().filter(demoService -> demoService.getNameList().contains(nameEnum.getCode())).findFirst().get()
                    .bussinessStart(nameEnum.getName());
        }
    }
}
