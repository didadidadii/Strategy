/**
 * @author： xulihao
 * @date： 2020-09-11 14:23
 * @Description: 支付策略工厂
 */


import java.util.HashMap;
import java.util.Map;

/**
 * 通过传入不同的paykey，
 * 从而根据策略创建不同的支付对象
 */
public class PayStrategy {
    public static final String DEFAULT_KEY = "VxPay";
    public static final String VX_KEY = "VxPay";
    public static final String ZFB_KEY = "ZfbPay";
    public static final String JD_KEY = "JdPay";
    private static Map strategyMap = new HashMap<String, Payment>();

    //存入支付对象
    static {
        strategyMap.put(DEFAULT_KEY, new VxPay());
        strategyMap.put(VX_KEY, new VxPay());
        strategyMap.put(ZFB_KEY, new ZfbPay());
        strategyMap.put(JD_KEY, new JDPay());
    }

    /**
     * 根据不同的key，得到不同的对象，避免了if。。。else。。
     *
     * @param payKey
     * @return
     */
    public static Payment getPayment(String payKey) {
        if (!strategyMap.containsKey(payKey)) {
            return (Payment) strategyMap.get(DEFAULT_KEY);
        }
        return (Payment) strategyMap.get(payKey);
    }
}
