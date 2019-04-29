package jdbc;

import java.sql.ResultSet;

/**
 * @Description:
 *         结果映射处理
 * @Auther: qingruizhu
 * @Date: 2019-04-28 10:02
 */
public interface RowMapper<T> {
    T mapRow(ResultSet rs, int rowNum) throws Exception;
}
