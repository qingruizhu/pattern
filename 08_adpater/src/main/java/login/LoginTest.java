package login;

/**
 * @Description:
 * @Auther: qingruizhu
 * @Date: 2019-04-28 17:17
 */
public class LoginTest {
    public static void main(String[] args) {
        LoginService loginService = new LoginService();
        loginService.loginByQQ("qingrui");
        loginService.loginByUsername("qingrui","12345");

    }
}
