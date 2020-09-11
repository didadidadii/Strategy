/**
 * @author： xulihao
 * @date： 2020-09-11 14:16
 * @Description:
 */

public class JDPay extends Payment {
    @Override
    public String getname() {
        return "京东白条支付";
    }

    @Override
    protected Double querybalance(String uid) {
        return Double.valueOf(500);
    }
}
