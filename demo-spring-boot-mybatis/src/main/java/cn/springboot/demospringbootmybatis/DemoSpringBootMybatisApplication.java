package cn.springboot.demospringbootmybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("cn.springboot.demospringbootmybatis.dao")
public class DemoSpringBootMybatisApplication {

   public static void main(String[] args) {
      SpringApplication.run(DemoSpringBootMybatisApplication.class, args);
   }
}
