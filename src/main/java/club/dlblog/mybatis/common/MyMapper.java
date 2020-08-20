package club.dlblog.mybatis.common;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * @author machenike
 */
public interface MyMapper<T> extends Mapper<T>, MySqlMapper<T> {

}
