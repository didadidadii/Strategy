/**
 * @author： xulihao
 * @date： 2020-09-11 13:44
 * @Description: 顶层支付抽象接口
 */

public abstract class Payment {
    /**
     * 得到支付渠道名称（微信支付，白条支付，支付宝支付）
     *
     * @return
     */
    public abstract String getname();

    /**
     * 支付
     *
     * @param uid    用户id
     * @param amount 支付金额
     * @return MsgResult
     * @throws Exception
     */
    public MsgResult pay(String uid, Double amount) throws Exception {
        this.checkParm(uid, amount);
        //查询余额是否足够
        if (querybalance(uid) < amount) {
            return new MsgResult().setCode(500).setMsg("余额不足").setData("支付失败");
        }
        return new MsgResult().setCode(200).setMsg("支付成功").setData(amount);
    }

    /**
     * 查询余额
     *
     * @param uid
     * @return
     */
    protected abstract Double querybalance(String uid);

    private void checkParm(String uid, Double amount) throws Exception {
        if (null == uid || null == amount) {
            throw new Exception("参数为空");
        }
    }


}
