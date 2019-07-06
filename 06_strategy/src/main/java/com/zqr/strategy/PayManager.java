package com.zqr.strategy;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import static com.zqr.strategy.PayManager.Payment.*;

/**
 * 策略结合工厂模式，对不同的支付策略进行管理
 */
public class PayManager {
        private static Map<String,IPay> manager = new ConcurrentHashMap<String, IPay>();
        static {
            manager.put(PAY_ALI,new ALiPay());
            manager.put(PAY_JD,new JDPay());
            manager.put(PAY_WECHAT,new WechatPay());
            manager.put(PAY_DEFAULT,new ALiPay());
        }
        public static IPay getPayMent(String payKey){
            if (manager.containsKey(payKey)){
                return manager.get(payKey);
            }
            return manager.get(PAY_DEFAULT);
        }
        interface Payment{
            String PAY_ALI = "alipay";
            String PAY_JD = "jdpay";
            String PAY_WECHAT = "wechatpay";
            String PAY_DEFAULT = PAY_ALI;
        }

}
