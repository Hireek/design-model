package com.p6.demo.design_model.decoretor.general;

/**
 * @author 徐恩晗 xshlxx@126.com
 * @since 2020/12/7
 */
public class ConcreteDecorateA extends Decorate{

    public ConcreteDecorateA(Component component) {
        super(component);
    }

    // 在调用父类的operation方法之前需要执行的操作
    private void operationFirst(){}
    // 在调用父类的operation方法之后需要执行的操作
    private void operationLast(){}

    public void operation() {
        operationFirst();
        super.operation();
        operationLast();
    }
}
