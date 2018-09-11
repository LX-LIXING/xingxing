package cn.springboot.log;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogTest {
   public Logger logger = LoggerFactory.getLogger(LogTest.class);

   @GetMapping("/loging")
   public String getLog() {
      logger.error("------------------------------------");
      return "error";
   }
}
