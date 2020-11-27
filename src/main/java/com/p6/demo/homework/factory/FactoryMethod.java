package com.p6.demo.homework.factory;

import com.p6.demo.homework.factory.impl.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author 扫地僧 xshlxx@126.com
 * @since 2020/11/27
 */
public class FactoryMethod {

    public static Map<String,IPay> factory = new HashMap<>();

    static {

        factory.put(PayFormatEnum.ALI.getValue(),new AliPayImpl());
        factory.put(PayFormatEnum.WEC.getValue(),new WecPayImpl());
        factory.put(PayFormatEnum.YIL.getValue(),new YilPayImpl());
        factory.put(PayFormatEnum.EPA.getValue(),new EpaPayImpl());
        factory.put(PayFormatEnum.GOOGLE.getValue(),new GooglePayImpl());

    }

    private FactoryMethod(){}


    public static IPay getInstance(String payType) {

        IPay iPay = factory.get(payType);

        if (null == iPay) {

            throw new IllegalArgumentException("不支持当前支付类型");
        }

        return iPay;
    }


    public static Set<String> getPayFormat() {

        return factory.keySet();
    }
}
