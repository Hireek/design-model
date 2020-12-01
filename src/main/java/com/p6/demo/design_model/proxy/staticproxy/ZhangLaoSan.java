package com.p6.demo.design_model.proxy.staticproxy;


/**
 * @author 徐恩晗 xshlxx@126.com
 * @since 2020/12/1
 */
public class ZhangLaoSan implements IPerson {


    private Zhangsan zhangsan;

    public ZhangLaoSan(Zhangsan zhangsan) {
        this.zhangsan = zhangsan;
    }

    @Override
    public void findLove() {

        System.out.println("张老三开始物色。。。");
        zhangsan.findLove();
        System.out.println("开始交往！");
    }
}
