//
//@Component
//@Slf4j
//public class MsgNoticeConstructorApp {
//
//    // 保证金解冻
//    public static final String FREEZE_THAW = "freeze_thaw";
//
//    // 保证金扣除
//    public static final String ENSURE_DEDUCT = "ensure_deduct";
//
//    // 交易失败
//    public static final String DEAL_FAIL = "deal_fail";
//
//    // 仲裁信息
//    public static final String ARBITRAGE = "arbitrage";
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
//
//        // 待付订金
//        if (res.get("orderType").equals(OrderEnum.PRE_PAYMENT.getName())) {
//
//            title = SaaS_Pre_Payment_Context;
//            preMessageDB = SaaS_Pre_Payment_Head + res.get("carTitle") + SaaS_Pre_Payment_Mid + res.get("price") + SaaS_Pre_Payment_Tail;
//            preMessageMsg = "";
//
//            // 待付尾款
//        } else if (res.get("orderType").equals(OrderEnum.PRE_FINAL_PAYMENT.getName())) {
//
//            title = SaaS_Pre_Final_Payment_Context;
//            preMessageDB = SaaS_Pre_Final_Payment_Head + res.get("carTitle") + SaaS_Pre_Final_Payment_Mid + res.get("price") + SaaS_Pre_Final_Payment_Tail;
//            preMessageMsg = "";
//            // 解冻
//        } else if (res.get("orderType").equals(FREEZE_THAW)) {
//
//            title = SaaS_Ensure_Thaw_Context;
//            preMessageDB = SaaS_Ensure_Thaw_Head + res.get("carTitle") + SaaS_Ensure_Thaw_Mid + res.get("price") + SaaS_Ensure_Thaw_Tail;
//            preMessageMsg = Common_Msg + res.get("carTitle") + SaaS_Ensure_Thaw_Tail_Msg;
//
//            // 短信
//            AdminRegVo data = commonResult.getData();
//
//            SMSQuery context = new SMSQuery();
//            context.setMobile(data.getMobile());
//            context.setContent(preMessageMsg);
//            messageService.sendNotification(context);
//
//            // 保证金扣除
//        } else if (res.get("orderType").equals(ENSURE_DEDUCT)) {
//
//            title = SaaS_Ensure_Deduction_Context;
//            preMessageDB = SaaS_Ensure_Deduction_Head + res.get("carTitle") + SaaS_Ensure_Deduction_Tail;
//            preMessageMsg = Common_Msg + res.get("carTitle") + SaaS_Ensure_Deduction_Tail_Msg;
//
//            AdminRegVo data = commonResult.getData();
//
//            SMSQuery context = new SMSQuery();
//            context.setMobile(data.getMobile());
//            context.setContent(preMessageMsg);
//            messageService.sendNotification(context);
//
//            // 交易失败
//        } else if (res.get("orderType").equals(DEAL_FAIL)) {
//
//            title = SaaS_Deal_Fail_Context;
//            preMessageDB = SaaS_Deal_Fail_Head + res.get("carTitle") + SaaS_Deal_Fail_Tail;
//
//            // 交易成功
//        } else if (res.get("orderType").equals("deal_success")) {
//
//            title = "您有一笔订单交易成功了！";
//            preMessageDB = "您拍下的车辆" + res.get("carTitle") + "已成功支付尾款" + res.get("price") + "元。"; // ，剩余尾款请您按时支付。]，点击【查看详情】，进入【待付款列表】
//
//            // 拍卖成功
//        } else if (res.get("orderType").equals(AUCTION_SUCCESS)) {
//
//            title = AUCTION_SUCCESS_TITLE;
//
//            preMessageDB = AUCTION_SUCCESS_HEAD + res.get("carTitle") + AUCTION_SUCCESS_TAIL;
//            preMessageMsg = Common_Msg + AUCTION_SUCCESS_MSG_HEAD + res.get("carTitle") + AUCTION_SUCCESS_MSG_TAIL;
//
//            AdminRegVo data = commonResult.getData();
//
//            SMSQuery context = new SMSQuery();
//            context.setMobile(data.getMobile());
//            context.setContent(preMessageMsg);
//            messageService.sendNotification(context);
//            log.info("交易成功通知:{}", res.get("userId"));
//
//            // 不推极光消息
//            preMessageMsg = "";
//
//            // 仲裁结果
//        } else if (res.get("orderType").equals(ARBITRAGE)) {
//
//            title = SaaS_Arbitrage_Context;
//            preMessageDB = SaaS_Arbitrage_Head + res.get("carTitle") + SaaS_Arbitrage_Tail;
//            preMessageMsg = Common_Msg + SaaS_Arbitrage_Head_Msg + res.get("carTitle") + SaaS_Arbitrage_Tail_Msg;
//
//            AdminRegVo data = commonResult.getData();
//
//            SMSQuery context = new SMSQuery();
//            context.setMobile(data.getMobile());
//            context.setContent(preMessageMsg);
//            messageService.sendNotification(context);
//
//        } else if (res.get("orderType").equals(Buyer_ARBITRAGE)) {
//
//            title = Backend_Msg;
//            preMessageMsg = Buyer_Launch_Ari;
//            AdminRegVo data = commonResult.getData();
//
//            SMSQuery context = new SMSQuery();
//            context.setMobile(data.getMobile());
//            context.setContent(preMessageMsg);
//            messageService.sendNotification(context);
//            log.info("买家发起仲裁:{}", res.get("userId"));
//            return;
//
//        } else if (SEND_MSG.equals(res.get("orderType"))) {
//
//            log.info("当前消息通知信息为:{}",res);
//            preMessageMsg = Common_Msg + MSG_NOTICE_HEAD + res.get("name") + MSG_NOTICE_MID + res.get("startTime") +MSG_NOTICE_TAIL + MSG_NOTICE_URL + res.get("carId") ;
//
//        } else if (ACTIVITY_WILL_START.equals(res.get("orderType"))) {
//
//            log.info("当前消息通知信息为百合平台");
//            preMessageMsg = Common_Msg + LILY_MSG_NOTICE_HEAD + res.get("name") + LILY_MSG_NOTICE_MID + res.get("time") + LILY_MSG_NOTICE_TAIL;
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
//                messageService.sendMarket(new SMSQuery(res.get("mobile"),preMessageMsg));
//
//            } else {
//
//                messageService.pushMessage(req);
//            }
//        } else if (ACTIVITY_WILL_START.equals(res.get("orderType"))) {
//
//            log.info("即将发送消息至百合平台管理员");
//            CommonResult<String> mobile = messageService.sendMarket(new SMSQuery(res.get("mobile"), preMessageMsg));
//            log.info("即将发送消息至百合平台管理员,回调消息为:{}",mobile);
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
