package cn.springboot.demospringbootmybatis.dao;

import cn.springboot.demospringbootmybatis.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Service;

import java.util.List;

//@Mapper
@Service
public interface UserDao {
   List<User> findAll();
}
