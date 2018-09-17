package cn.springboot.commonException;

import lombok.Getter;

public class CommonException extends RuntimeException {
   private static final long serialVersionUID = 1L;

   @Getter
   private int code;
   @Getter
   private EnumSystemCode systemCode;
   @Getter
   private String msg;

   public CommonException(int code, String msg) {
      super(msg);
      this.code = code;
      this.msg = msg;
      this.systemCode = EnumSystemCode.findByCode(code);
   }

   public CommonException(EnumSystemCode systemCode) {
      super(systemCode.getConent());
      this.code = systemCode.getCode();
      this.systemCode = systemCode;
   }

   public CommonException(EnumSystemCode systemCode, String msg) {
      super(msg);
      this.code = systemCode.getCode();
      this.msg = msg;
      this.systemCode = systemCode;
   }

   public CommonException(String msg) {
      this(EnumSystemCode.COMMON.getCode(), msg);
      this.msg = msg;
   }

   public static CommonException getInstance(String msg, Object... args) {
      for (Object object : args) {
         msg = msg.replaceFirst("\\{\\}", object.toString());
      }
      return new CommonException(msg);
   }

   public static CommonException getInstance(String msg) {
      return new CommonException(msg);
   }
}
