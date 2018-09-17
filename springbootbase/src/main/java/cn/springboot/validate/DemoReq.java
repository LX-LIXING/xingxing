package cn.springboot.validate;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DemoReq {
   @NotBlank(message = "code不能为空")
   String code;

   @Length(max=10,message="name长度不能超多10")
   String name;


   public static void main(String[] argd){
      Map<String, BigDecimal> a = new HashMap();
      a.put("a", new BigDecimal(235656.000000));

      Double b = a.get("a").doubleValue();

      Double c = Double.parseDouble(a.get("a").toString());
      System.err.println(b);
   }
}
