package cn.springboot.listener;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;


/*
* 1.创建一个监听类
* 2.在启动类中加入 @ServlerComponentScan
*
* */

@WebListener
@Slf4j
public class ServletListener implements ServletRequestListener {
   @Override
   public void requestDestroyed(ServletRequestEvent sre) {
      log.debug("----------监听器：销毁");
   }

   @Override
   public void requestInitialized(ServletRequestEvent sre) {
      log.debug("----------监听器：初始化");
   }
}
