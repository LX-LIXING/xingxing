package cn.springboot.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/configuration")
public class Configuration {
   //属性引用
   @Value("${base.name}")
   private String name;

   @Value("${base.value}")
   private String randomValue;

   @Value("${xing.body}")
   List<String> body;

   @GetMapping("/name")
   public String getConfigurationName(){
      return name + "-" + randomValue + "-" + body.toString();
   }
}
