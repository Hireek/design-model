package com.p6.demo.design_model.flyweight.ticket;

import java.util.Random;

/**
 * @author 扫地僧 xshlxx@126.com
 * @since 2020/12/10
 */
public class TrainTicket implements ITicket{

    private String from;

    private String to;

    private int price;


    public TrainTicket(String from, String to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public void showInfo(String bunk) {

        this.price = new Random().nextInt(500);

        System.out.println(from + " ->" + to + ": " + bunk + "价格" + this.price);
    }
}
