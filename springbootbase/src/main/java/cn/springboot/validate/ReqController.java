package cn.springboot.validate;

import cn.springboot.util.ValidatorUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReqController {

   @GetMapping("/validate")
   public DemoReq demoValid(DemoReq req) {
      ValidatorUtil.validate(req);
      return req;
   }
}
