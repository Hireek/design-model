package com.p6.demo.design_model.msgFactory;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author 扫地僧 xshlxx@126.com
 * @since 2020/11/26
 */
public class StrategyFactory {


    private static Map<String,IMessageFactory> messages = new HashMap<>();

    static {

        messages.put(MessageEnum.PRE_DEAL.getKey(),new PrePaymentFactory());
        messages.put(MessageEnum.PRE_FINAL_PAYMENT.getKey(),new PreFinalFactory());
    }

    private StrategyFactory() {}

    public static IMessageFactory getMessageImpl(String messageType) {

        IMessageFactory  messageFactory = messages.get(messageType);

        if (null == messageFactory) {

            throw new IllegalArgumentException("请输入合法的消息类型");
        }

        return messageFactory;
    }

    public static Set<String> getMessages() {

        return messages.keySet();
    }
}
