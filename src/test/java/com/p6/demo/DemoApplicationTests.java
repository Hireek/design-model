package com.p6.demo;

import com.p6.demo.current.factory.DemoFactory;
import com.p6.demo.current.factory.DemoNameEnum;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class DemoApplicationTests {

    @Test
    void contextLoads() {
    }

    @Resource
    private DemoFactory demoFactory;

    @Test
    void testBean() {
        demoFactory.execute(0);
        demoFactory.execute(DemoNameEnum.A.getCode());
        demoFactory.execute(DemoNameEnum.B.getCode());
    }
}
