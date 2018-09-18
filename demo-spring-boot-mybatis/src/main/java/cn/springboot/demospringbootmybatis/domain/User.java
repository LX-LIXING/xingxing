package cn.springboot.demospringbootmybatis.domain;


import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.sql.Timestamp;

@Slf4j
@Data
public class User {
   private Integer id;

   private String code;

   private String name;

   private Character status;

   private Timestamp gmtCreate;

   private Timestamp gmtModified;

}
