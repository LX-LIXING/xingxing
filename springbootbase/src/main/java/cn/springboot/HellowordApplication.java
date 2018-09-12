package cn.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@ServletComponentScan("cn.springboot.listener")
@PropertySource(value = "classpath:defination.properties")
public class HellowordApplication {

   public static void main(String[] args) {
      SpringApplication.run(HellowordApplication.class, args);
   }
}
