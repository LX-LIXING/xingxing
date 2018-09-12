package cn.springboot.localException;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExceptionController {

   @GetMapping("/exception")
   public String getException() throws ClassNotFoundException {
      throw new ClassNotFoundException("查无此类");
   }
}
