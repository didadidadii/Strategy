/**
 * @author： xulihao
 * @date： 2020-09-11 14:55
 * @Description: 订单支付测试
 */

public class Test {
    public static void main(String[] args) {
        Double value = Double.valueOf(400);
        Order order = new Order("1", "2", value);
        //默认wx支付
        //MsgResult msgResult = order.pay();
        MsgResult msgResult = order.pay(PayStrategy.ZFB_KEY);
        System.err.println(msgResult);
    }
}
