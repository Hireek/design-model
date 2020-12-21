package com.p6.demo.design_model.decoretor.general;

/**
 * @author 徐恩晗 xshlxx@126.com
 * @since 2020/12/7
 */
public abstract class Decorate {

    /**
     * 持有组件对象
     */
    protected Component component;

    public Decorate(Component component) {
        this.component = component;
    }

    public void operation() {

        // 转发请求给组件对象，可以在转发前后执行一些附加动作
        component.operation();
    }
}
