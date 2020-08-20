package club.dlblog.mybatis;

import club.dlblog.dao.TestDao;
import club.dlblog.entity.TestEntity;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@SpringBootTest
class BlogMybatisApplicationTests {

    @Autowired
    TestDao testDao;
    @Test
    void contextLoads() {
        PageHelper.startPage(1, 10);
        List<TestEntity> list =  testDao.queryAll();
        PageInfo<TestEntity> p=new PageInfo<TestEntity>(list);
        p.getPageNum();
        Example example = new Example(TestEntity.class);
        testDao.selectByExample(example);
    }

}
