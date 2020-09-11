/**
 * @author： xulihao
 * @date： 2020-09-11 14:14
 * @Description: 支付宝支付
 */

public class ZfbPay extends Payment {
    @Override
    public String getname() {
        return "支付宝支付";
    }

    @Override
    protected Double querybalance(String uid) {
        return Double.valueOf(500);
    }
}
