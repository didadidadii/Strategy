/**
 * @author： xulihao
 * @date： 2020-09-11 13:48
 * @Description: 结果集(链式调用 ）
 */

public class MsgResult {
    private int code;
    private Object data;
    private String msg;

    public int getCode() {
        return code;
    }

    public MsgResult setCode(int code) {
        this.code = code;
        return this;
    }

    public Object getData() {
        return data;
    }

    public MsgResult setData(Object data) {
        this.data = data;
        return this;
    }

    public String getMsg() {
        return msg;
    }

    public MsgResult setMsg(String msg) {
        this.msg = msg;
        return this;
    }

    @Override
    public String toString() {
        return "MsgResult{" +
                "code=" + code +
                ", data=" + data +
                ", msg='" + msg + '\'' +
                '}';
    }
}
