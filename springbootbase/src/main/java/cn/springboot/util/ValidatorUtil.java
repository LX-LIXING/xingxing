package cn.springboot.util;

import cn.springboot.commonException.CommonException;
import org.hibernate.validator.HibernateValidator;
import org.hibernate.validator.HibernateValidatorConfiguration;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import java.util.Set;

public class ValidatorUtil {
   private static Validator validator =
      ((HibernateValidatorConfiguration) Validation.byProvider(HibernateValidator.class).configure()).failFast(true)
                                                                                                     .buildValidatorFactory()
                                                                                                     .getValidator();
   /**
    * 实体校验
    *
    * @param obj
    * @throws CommonException
    */
   public static <T> void validate(T obj) throws CommonException {
      Set<ConstraintViolation<T>> constraintViolations = validator.validate(obj, new Class[0]);
      if (constraintViolations.size() > 0) {
         ConstraintViolation<T> validateInfo = (ConstraintViolation<T>) constraintViolations.iterator().next();

         throw new CommonException(4001015, validateInfo.getMessage());
      }
   }
}
