package cn.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource(value = "classpath:defination.properties", encoding = "utf-8")
public class HellowordApplication {

   public static void main(String[] args) {
      SpringApplication.run(HellowordApplication.class, args);
   }
}
