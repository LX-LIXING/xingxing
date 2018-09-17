package cn.springboot.localException;

import cn.springboot.commonException.CommonException;
import cn.springboot.commonException.EnumSystemCode;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.StringUtils;
import org.springframework.validation.BindException;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;


/*
 * 1.自定义异常类，添加@ControllerAdvice注解
 * 2.定义方法添加@ExceptionHandler注解，此注解用来标识处理那种异常
 * 3.返回的可以是json串，同时也可以返回ModelAndView
 *
 * */

@ControllerAdvice
@Slf4j
public class LocalExceptionHandle {

   @ExceptionHandler(NullPointerException.class)
   @ResponseBody
   public Map<String, Object> NullPointerExceptionHandle(Exception e) {
      Map<String, Object> result = new HashMap<String, Object>();
      result.put("respCode", "444");
      result.put("resoMsg", e.getMessage());

      return result;
   }

   @ExceptionHandler(ClassNotFoundException.class)
   @ResponseBody
   public Map<String, Object> classNotFoundExceptionHandle(Exception e) {
      Map<String, Object> result = new HashMap<String, Object>();
      result.put("respCode", "555");
      result.put("resoMsg", e.getMessage());

      return result;
   }

   @ExceptionHandler(BindException.class)
   @ResponseBody
   public Map<String, Object> handleBindException(BindException ex) {
      FieldError fieldError = ex.getBindingResult().getFieldError();
      log.info("参数校验异常:{}({})", fieldError.getDefaultMessage(), fieldError.getField());
      Map<String, Object> result = new HashMap<String, Object>();
      result.put("respCode", "01002");
      result.put("respMsg", fieldError.getDefaultMessage());
      return result;
   }


   @ExceptionHandler(CommonException.class)
   @ResponseBody
   public Map<String, Object> commonExceptionHandle(CommonException ex) {
      Map<String, Object> result = new HashMap<String, Object>();
      result.put("respCode", ex.getCode());
      result.put("respMsg", StringUtils.isEmpty(ex.getMsg()) ? ex.getSystemCode().getConent() : ex.getMsg());
      return result;
   }
}
