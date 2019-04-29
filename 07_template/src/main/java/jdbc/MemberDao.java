package jdbc;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.util.List;

/**
 * @Description:
 * @Auther: qingruizhu
 * @Date: 2019-04-28 10:39
 */
public class MemberDao extends JdbcTemplate {
    public MemberDao(DataSource dataSource) {
        super(dataSource);
    }

    public List<?> queryAll(){
        String sql = "select * from member";
        List<?> results = super.executeQuery(sql, new RowMapper() {
            @Override
            public Object mapRow(ResultSet rs, int rowNum) throws Exception {
                Member member = new Member();
                member.setName(rs.getString("name"));
                member.setSex(rs.getString("sex"));
                member.setAge(rs.getInt("age"));
                return member;
            }
        }, null);
        return results;
    }
}
