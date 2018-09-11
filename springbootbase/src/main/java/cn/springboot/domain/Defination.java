package cn.springboot.domain;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@ConfigurationProperties(prefix = "xing")
@Data
@RestController
public class Defination {
   private String name;

   private List<String> body;

   @GetMapping("/defination")
   public String getDefination() {
      return name + '-' + body.toString();
   }
}
