package cn.itcast.eshop.user;

import cn.itcast.eshop.common.action.BaseAction;
import cn.itcast.eshop.common.entity.Msg;
import cn.itcast.eshop.common.util.JSONUtil;

/**
 * 用户控制器类
 * 处理用户的后台操作，并返回JSON格式的字符串消息
 */
public class UserAction extends BaseAction {

    //用户名
    private String username;
    // 密码
    private String password;

    /**
     * 用户登录功能
     * @return
     */
    public String login(){
        System.out.println("username"+username);
        System.out.println("password"+password);
        Msg msg = new Msg();
        msg.setType(Msg.SUCCESS);//登录成功
        msg.setMsg("返回信息");
        return JSONUtil.entity2JSON(msg);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
