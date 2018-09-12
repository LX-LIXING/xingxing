package cn.springboot.configFile;


import cn.springboot.interceptor.CustomHandleInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class ConfigInterceptorFile extends WebMvcConfigurerAdapter {
   @Override
   public void addInterceptors(InterceptorRegistry registry) {
      registry.addInterceptor(getHandleInterceptor()).addPathPatterns("/*");
   }

   @Bean
   public static HandlerInterceptor getHandleInterceptor(){
      return new CustomHandleInterceptor();
   }
}
