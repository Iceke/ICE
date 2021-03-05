package cn.itcast.eshop.common.entity;

/**
 * 消息封装累
 */
public class Msg {

    public static final String SUCCESS = "SUCCESS";
    public static final String FAIL = "FAIL";
    // 消息类型，成功success 失败 ，fail
    private String type;
    //消息内容
    private String msg;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
