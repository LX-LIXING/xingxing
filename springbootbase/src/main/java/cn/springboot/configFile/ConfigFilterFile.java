package cn.springboot.configFile;

import cn.springboot.filter.MyWebFilter;
import cn.springboot.filter.MyWebFilter2;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.Filter;

/*
 * 自定义过滤器并排序
 *
 * 1.自定义过滤器
 * 2.自定义此文件
 * 3.在启动类上加上@ServletComponentScan
 * */

@Configuration
public class ConfigFilterFile {
   @Bean
   public FilterRegistrationBean filterRegistrationBean() {
      FilterRegistrationBean registration = new FilterRegistrationBean();

      registration.setFilter(MyWebFilter1());
      //过滤器名称
      registration.setName("MyWebFilter1");
      //拦截路径
      registration.addUrlPatterns("/*");
      //设置顺序
      registration.setOrder(10);

      return registration;
   }

   @Bean
   public FilterRegistrationBean filterRegistrationBean2() {
      FilterRegistrationBean registration = new FilterRegistrationBean();

      registration.setFilter(MyWebFilter2());

      registration.setName("MyWebFilter2");
      //拦截路径
      registration.addUrlPatterns("/*");
      //设置顺序
      registration.setOrder(5);

      return registration;
   }

   @Bean
   public Filter MyWebFilter1() {
      return new MyWebFilter();
   }

   @Bean
   public Filter MyWebFilter2() {
      return new MyWebFilter2();
   }
}
