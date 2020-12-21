package com.p6.demo.current.factory;

import java.util.Collections;
import java.util.List;

/**
 * @Author: Chord
 * @Date: 2020/12/15 11:42 上午
 * @Description: 抽象类中各阶段业务逻辑实现
 *               模板过程卸载业务入口方法中
 *               差异化业务实现定义抽象方法
 *               通用业务实现定义非抽象方法
 */
public abstract class AbstractDefaultDemoServiceImpl implements DemoService {

    @Override
    public List<Integer> getNameList() {
        return Collections.emptyList();
    }

    public void buildContext() {

    }

    @Override
    public void bussinessStart(String name) {
        buildContext();
        executeBussiness(name);
        clean();
    }

    public abstract void executeBussiness(String name);

    public void clean() {

    }
}
