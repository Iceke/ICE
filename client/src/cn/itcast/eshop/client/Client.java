package cn.itcast.eshop.client;

/**
 * 客户端顶层父类
 * 处理公共的用户操作
 **/
public class Client {

    /**
     * 全局 用户操作 登录
     */
    public static final String LOGING = "L";
    /**
     * 全局 用户操作 上一次操作记录
     */
    public static final String HISTORY = "I";
    /**
     * 全局 用户操作 首页
     */
    public static final String INDEX = "I";

    public static void main(String[] args) {
        Client c = new Client();
        c.start();
    }

    public void start() {
        UserClient userClient = new UserClient();
        String result = userClient.showLogin();
        if(result.equals(INDEX)){
            System.out.println("这里是首页");
        }else if(result.equals(LOGING)){
            System.out.println("这里是登录页面");
        }else if(result.equals(HISTORY)){
            System.out.println("这里是历史页面");
        }else{
            System.out.println("出错了");
        }
    }
}
