/**
 * @author： xulihao
 * @date： 2020-09-11 14:13
 * @Description: 微信支付
 */

public class VxPay extends Payment {
    @Override
    public String getname() {
        return "微信支付";
    }

    @Override
    protected Double querybalance(String uid) {
        return Double.valueOf(500);
    }
}
