package login;

/**
 * @Description:
 * @Auther: qingruizhu
 * @Date: 2019-04-28 17:02
 */
public class QQAdapter implements ILoginAdapter {
    public boolean support(Object adapter) {
        return adapter instanceof QQAdapter;
    }

    public void login(String id) {
        System.out.println("QQ登陆：id["+id+"]");
    }
}
