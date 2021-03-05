package cn.itcast.eshop.client;

import cn.itcast.eshop.common.entity.Msg;
import cn.itcast.eshop.common.util.JSONUtil;
import cn.itcast.eshop.user.UserAction;

import java.util.Scanner;

/*
   用户操作界面
   所有和用用户操作相关内容
 */
public class UserClient extends Client {

    /**
     * 用户登录操作页面
     *
     * @return
     */
    public String showLogin() {
        //1.使用控制台显示用户输入用户名 ，密码
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名");
        String username = sc.nextLine();
        System.out.println("请输入密码");
        String password = sc.nextLine();

        // 2.向服务器发送请求，并接受返回消息字符串
        UserAction userAction = new UserAction();
        // 2.1使用setter 方法把数据操作给Action
        userAction.setUsername(username);
        userAction.setPassword(password);
        // 2.2调用Action的登录功能
        String result = userAction.login();

        // 3. 解析消息字符串，提示用户信息
        Msg msg = JSONUtil.JSON2Entity(result, Msg.class);
        if(msg.getType().equals(Msg.SUCCESS)){
            System.out.println("登录成功");
            return HISTORY;
        }else{
            System.out.println("登录失败");
            return LOGING;
        }
    }
}
