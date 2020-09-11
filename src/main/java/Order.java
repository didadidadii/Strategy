/**
 * @author： xulihao
 * @date： 2020-09-11 14:17
 * @Description: 订单
 */

public class Order {
    private String uid;
    private String orderid;
    //交易金额
    private Double amount;

    public Order(String uid, String orderid, Double amount) {
        this.uid = uid;
        this.orderid = orderid;
        this.amount = amount;
    }

    /**
     * 默认微信支付
     *
     * @return
     */
    public MsgResult pay() {
        return pay(PayStrategy.DEFAULT_KEY);
    }

    /**
     * 选择支付渠道,支付
     *
     * @param payKey
     * @return
     */
    public MsgResult pay(String payKey) {
        Payment payment = PayStrategy.getPayment(payKey);
        String payname = payment.getname();
        System.out.println("欢迎使用" + payname);
        System.out.println("本次交易金额为:" + amount + "元，开始扣款...");
        MsgResult msgResult = null;
        try {
            //支付
            msgResult = payment.pay(uid, amount);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return msgResult;
    }
}
