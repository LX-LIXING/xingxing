package cn.springboot.interceptor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/*
* 1.自定义拦截器
* 2.继承WebMvcConfigurerAdapter,注册拦截器
* */

@Slf4j
public class CustomHandleInterceptor implements HandlerInterceptor {
   @Override
   public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
      log.info("----------preHandle:interceptor请求前调用");
      return true;
   }

   @Override
   public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
                          ModelAndView modelAndView) throws Exception
   {
      log.info("----------postHandle:intercept请求后调用");
   }

   @Override
   public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler,
                               Exception ex) throws Exception
   {
      log.info("----------afterCompletion:interceptor:请求调用完成后回调方法");
   }
}
