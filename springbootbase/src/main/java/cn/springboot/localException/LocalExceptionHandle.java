package cn.springboot.localException;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;


/*
* 1.自定义异常类，添加@ControllerAdvice注解
* 2.定义方法添加@ExceptionHandler注解，此注解用来标识处理那种异常
*
* */

@ControllerAdvice
public class LocalExceptionHandle {

   @ExceptionHandler(NullPointerException.class)
   @ResponseBody
   public Map<String, Object> NullPointerExceptionHandle(Exception e){
      Map<String, Object> result = new HashMap<String, Object>();
      result.put("respCode", "444");
      result.put("resoMsg", e.getMessage());

      return result;
   }

   @ExceptionHandler(ClassNotFoundException.class)
   @ResponseBody
   public Map<String, Object> classNotFoundExceptionHandle(Exception e){
      Map<String, Object> result = new HashMap<String, Object>();
      result.put("respCode", "555");
      result.put("resoMsg", e.getMessage());

      return result;
   }
}
