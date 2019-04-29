package jdbc;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @Auther: qingruizhu
 * @Date: 2019-04-28 10:05
 */
public class JdbcTemplate {
    private DataSource dataSource;

    public JdbcTemplate(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public List<?> executeQuery(String sql, RowMapper rowMapper, Object[] values) {
        try {
            //1.获取连接
            Connection conn = this.getConnection();
            //2.创建语句集
            PreparedStatement psm = this.prepareStatement(conn, sql);
            //3.执行语句
            ResultSet rs = this.executeQuery(psm, values);
            //4.处理结果集
            List<?> result = this.parseResultSet(rs, rowMapper);
            //5.关闭结果集
            this.closeResultSet(rs);
            //6.关闭语句集
            this.closeStatement(psm);
            //7.关闭连接
            this.closeConnection(conn);
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;

    }

    private void closeConnection(Connection conn) throws Exception { //数据库连接池，我们不是关闭
        conn.close();
    }

    private void closeStatement(PreparedStatement pstm) throws Exception {
        pstm.close();
    }

    private void closeResultSet(ResultSet rs) throws Exception {
        rs.close();
    }

    private List<?> parseResultSet(ResultSet rs, RowMapper rowMapper) throws Exception {
        List<Object> result = new ArrayList<>();
        int rowNum = 1;
        while (rs.next()) {
            result.add(rowMapper.mapRow(rs, rowNum++));
        }
        return result;
    }

    private ResultSet executeQuery(PreparedStatement psm, Object[] values) throws Exception {
        for (int i = 0; i < values.length; i++) {
            psm.setObject(i, values[i]);
        }
        return psm.executeQuery();
    }

    private PreparedStatement prepareStatement(Connection conn, String sql) throws Exception {
        return conn.prepareStatement(sql);

    }

    private Connection getConnection() throws Exception {
        return dataSource.getConnection();
    }
}
