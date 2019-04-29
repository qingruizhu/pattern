package login;

/**
 * @Description:
 * @Auther: qingruizhu
 * @Date: 2019-04-28 17:02
 */
public class WechatAdapter implements ILoginAdapter {
    public boolean support(Object adapter) {
        return adapter instanceof WechatAdapter;
    }

    public void login(String id) {
        System.out.println("Wechat登陆：id["+id+"]");
    }
}
