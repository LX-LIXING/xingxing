package cn.springboot.filter;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/*
* 1.定义类并实现Filter接口
* 2.在启动类上加上@ServletComponentScan
* */

@WebFilter
@Slf4j
public class MyWebFilter implements Filter {

   @Override
   public void init(FilterConfig filterConfig) throws ServletException {
      log.info("--------------------filter:初始化1");
   }

   @Override
   public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException,
      ServletException
   {
      log.info("---------------------dofilter 请求处理1");

      chain.doFilter(request, response);
   }

   @Override
   public void destroy() {
      log.info("---------------------filter:销毁1");
   }
}
