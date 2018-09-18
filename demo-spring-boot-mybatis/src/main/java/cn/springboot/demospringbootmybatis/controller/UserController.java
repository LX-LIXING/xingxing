package cn.springboot.demospringbootmybatis.controller;

import cn.springboot.demospringbootmybatis.dao.UserDao;
import cn.springboot.demospringbootmybatis.domain.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
public class UserController {
   @Autowired
   private UserDao userDao;

   @GetMapping("/users")
   public List<User> getUsers(){
      List<User> users = userDao.findAll();
      return users;
   }
}
