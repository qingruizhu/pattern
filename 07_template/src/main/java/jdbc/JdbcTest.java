package jdbc;

/**
 * @Description:
 * @Auther: qingruizhu
 * @Date: 2019-04-28 10:53
 */
public class JdbcTest {
    public static void main(String[] args) {
        MemberDao memberDao = new MemberDao(null);
        memberDao.queryAll();
    }
}
