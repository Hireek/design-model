//package com.p6.demo.design_model.msgFactory2.factory;
//
//import com.jmc.auction.service.IFeignCommonsService;
//import com.jmc.auction.service.IFeignPushService;
//import com.jmc.auction.service.ITMessageAllService;
//import com.jmc.basetool.api.CommonResult;
//import com.jmc.basetool.constant.KafkaConstants;
//import com.jmc.basetool.constant.MessageConstant;
//import com.jmc.basetool.domain.TMessageAll;
//import com.jmc.basetool.enums.OrderEnum;
//import com.jmc.basetool.push.PushQuery;
//import com.jmc.basetool.push.SMSQuery;
//import com.jmc.basetool.utils.UserUtil;
//import com.jmc.basetool.vo.merchant.AdminRegVo;
//import com.nala.tools.json.JsonToMap;
//import com.nala.tools.number.NumberUtil;
//import lombok.extern.slf4j.Slf4j;
//import org.apache.commons.lang3.StringUtils;
//import org.apache.kafka.clients.consumer.ConsumerRecord;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.kafka.annotation.KafkaListener;
//import org.springframework.stereotype.Component;
//import org.springframework.transaction.annotation.Transactional;
//
//import java.util.Map;
//import java.util.Objects;
//
//import static com.jmc.auction.kafka.MsgNoticeConstructor.AUCTION_SUCCESS;
//import static com.jmc.basetool.constant.Constants.ACTIVITY_WILL_START;
//import static com.jmc.basetool.constant.Constants.SEND_MSG;
//import static com.jmc.basetool.constant.MsgNoticeConstants.*;
//
///**
// * @author 徐恩晗 xshlxx@126.com
// * @since 2020/8/15
// */
//@Component
//@Slf4j
//public class MsgNoticeConstructorApp {
//
//    // 买家发起仲裁
//    public static final String Buyer_ARBITRAGE = "buyer_arbitrage";
//
//    // 交易通知---消息推送
//    public static final Integer TRADE_CLASS = 1;
//
//
//    @Autowired
//    private IFeignPushService messageService;
//
//    @Autowired
//    private ITMessageAllService messageAllService;
//
//    @Autowired
//    private IFeignCommonsService commonsService;
//
//
//    @KafkaListener(topics = {KafkaConstants.MESSAGE_TOPIC_APP}, groupId = "message-topic-SaaS-2")
//    @Transactional(rollbackFor = Exception.class)
//    public void data(ConsumerRecord consumerRecord) {
//
//        // ProductId, OrderType
//        Map<String, String> res = JsonToMap.toMap(consumerRecord.value());
//        log.info("进入到kafka 消息度列{}",res);
//        // 消息推送
//        PushQuery req = new PushQuery();
//        // 获取极光id
//        CommonResult<AdminRegVo> commonResult = commonsService.getPushId(NumberUtil.parseLong(res.get("userId")));
//
//        TMessageAll message = new TMessageAll();
//
//
//        if (!ACTIVITY_WILL_START.equals(res.get("orderType"))) {
//
//            if (Objects.isNull(commonResult.getData()) || Objects.isNull(commonResult.getData().getRegId())) {
//
//                log.error("当前用户{}极光id为null,请仔细核对", UserUtil.getUserId());
//            }
//        }
//
//
//        String preMessageMsg = "";
//        String preMessageDB = "";
//        String title = "";
//        if (SEND_MSG.equals(res.get("orderType"))) {
//
//            log.info("当前消息通知信息为:{}",res);
//            preMessageMsg = Common_Msg + MSG_NOTICE_HEAD + res.get("name") + MSG_NOTICE_MID + res.get("startTime") +MSG_NOTICE_TAIL + MSG_NOTICE_URL + res.get("carId");
//
//        } else if (ACTIVITY_WILL_START.equals(res.get("orderType"))) {
//
//            log.info("当前消息通知信息为百合平台");
//            preMessageMsg = Common_Msg + LILY_MSG_NOTICE_HEAD + res.get("name") + LILY_MSG_NOTICE_MID + res.get("time") + LILY_MSG_NOTICE_TAIL + LILY_NOTICE_URL+ res.get("carId");
//        }
//        if (!StringUtils.isNotBlank(preMessageMsg) && ACTIVITY_WILL_START.equals(res.get("orderType"))) {
//
//            req.setRegistrationId(commonResult.getData().getRegId());
//            req.setAlert(preMessageMsg);
//            // 额外信息，留作补充(跳转连接)
//            req.setExtras(null);
//            // 获取平台信息
//            req.setPlatform(commonResult.getData().getPlatform());
//            // IOS 没有Title
//            req.setTitle("");
//            // false 即时推送  true 定时
//            req.setTiming(false);
//            // 定时时间
//            req.setPushTime("2099-06-23 17:43:00");
//
//            // 极光推送信息
//            if (res.get("orderType").equals(Buyer_ARBITRAGE)) {
//
//                messageService.pushMessageSell(req);
//
//            } else if (SEND_MSG.equals(res.get("orderType"))){
//
//                log.info("发送短信手机号:{},发送消息为:{}",res.get("mobile"),preMessageMsg);
//                CommonResult<String> mobile = messageService.sendMarket(new SMSQuery(res.get("mobile"), preMessageMsg));
//                log.info("发送短信结果为:{}",mobile);
//
//            } else {
//
//                messageService.pushMessage(req);
//            }
////    }
////        else if (ACTIVITY_WILL_START.equals(res.get("orderType"))) {
////
////            log.info("即将发送消息至百合平台管理员");
////            CommonResult<String> mobile = messageService.sendMarket(new SMSQuery(res.get("mobile"), preMessageMsg));
////            log.info("即将发送消息至百合平台管理员,回调消息为:{}",mobile);
//
//        } else if (AUCTION_SUCCESS.equals(res.get("orderType"))) {
//
//            log.info("中标通知 1");
//            CommonResult<String> mobile = messageService.sendMarket(new SMSQuery(res.get("mobile"), preMessageMsg));
//            log.info("中标通知 2:{}",mobile);
//
//        }
//        // 推送消息至数据库
//        if (!res.get("orderType").equals(Buyer_ARBITRAGE)) {
//
//            if (!res.get("orderType").equals(SEND_MSG)) {
//
//                message.setUserId(NumberUtil.parseLong(res.get("userId")));
//                message.setAuctionCode(res.get("auctionCode"));
//                message.setProductId(NumberUtil.parseInt(res.get("productId")));
//                message.setStatus(MessageConstant.MESSAGE_STATUS_NOT_READ);
//                message.setType(TRADE_CLASS);
//                message.setContext(preMessageDB);
//                message.setTitle(title);
//                message.setWebPushId(res.get("webPushRecordId"));
//
//                messageAllService.save(message);
//            }
//        }
//    }
//}
//
//
