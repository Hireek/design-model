package com.p6.demo.design_model.flyweight.ticket;

/**
 * @author 扫地僧 xshlxx@126.com
 * @since 2020/12/10
 */
public class Test {

    public static void main(String[] args) {

        ITicket ticket = TicketFactory.queryTicket("北京西","长沙");

        ticket.showInfo("硬座");

        ticket = TicketFactory.queryTicket("北京西","长沙");

        ticket.showInfo("软座");

        ticket = TicketFactory.queryTicket("北京西","长沙南");

        ticket.showInfo("硬卧");
    }
}
