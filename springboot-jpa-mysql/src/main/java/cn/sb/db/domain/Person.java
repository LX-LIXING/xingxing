package cn.sb.db.domain;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Slf4j
@Data
public class Person {
   @Id
   @GeneratedValue
   private Long id;

   private String name;

   private Integer age;

   private String address;
}
