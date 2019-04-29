package login;

/**
 * @Description:
 * @Auther: qingruizhu
 * @Date: 2019-04-28 17:11
 */
public class LoginService extends OldLogin implements ILoginService {

    public void loginByQQ(String id) {
        new QQAdapter().login(id);

    }

    public void loginByWechat(String id) {
        new WechatAdapter().login(id);

    }


}
