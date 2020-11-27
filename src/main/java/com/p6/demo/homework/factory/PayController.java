package com.p6.demo.homework.factory;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 扫地僧 xshlxx@126.com
 * @since 2020/11/27
 */
@RestController
@RequestMapping("/pay")
public class PayController {

    @PostMapping("/launch")
    public String getPayMessage(String payType) {

        IPay instance = FactoryMethod.getInstance(payType);

        String message = instance.pay();

        return message;
    }


    public static void main(String[] args) {

        PayController con = new PayController();

        System.out.println(con.getPayMessage("ALI"));

    }
}
