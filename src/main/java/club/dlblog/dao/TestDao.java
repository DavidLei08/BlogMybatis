package club.dlblog.dao;

import club.dlblog.entity.TestEntity;
import club.dlblog.mybatis.common.MyMapper;

import javax.persistence.Table;
import java.util.List;

/**
 * @author machenike
 */
@Table(name = "test")
public interface TestDao extends MyMapper<TestEntity> {
    List<TestEntity> queryAll();
}
