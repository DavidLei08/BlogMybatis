package club.dlblog.mybatis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;



@SpringBootApplication
@MapperScan(basePackages = "club.dlblog.dao")
public class BlogMybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(BlogMybatisApplication.class, args);
    }

}

