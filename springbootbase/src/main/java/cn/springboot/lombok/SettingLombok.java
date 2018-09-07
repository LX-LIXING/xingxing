package cn.springboot.lombok;

import cn.springboot.domain.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SettingLombok {

   @GetMapping("/lombok")
   public String getLombok() {
      Person li = new Person();
      li.setName("xingxing");
      li.setDesc("The star is king ");
      return li.toString();
   }
}
