package login;

/**
 * @Description:
 * @Auther: qingruizhu
 * @Date: 2019-04-28 16:47
 */
public interface ILoginAdapter {
    boolean support(Object adapter);
    void login(String id);
}
