package com.itheima.d2_static_util;

import java.util.Random;

/**
 * @BelongsProject: Javasepro @BelongsPackage: com.itheima.d2_static_util @Author:
 * LiSiFan @CreateTime: 2023-01-16 17:17 @Description: TODO @Version: 1.0
 */
public class checkUtil {
   /**注意：由于工具里面都是静态方法，直接用类名即可访问
    * 因此工具类无须创建对象，建议将工具的构造器进行私有
    * 作为工具包，私有后，不能产生对象*/
  public checkUtil(){
  }

  /** 静态方法 */
  public static String creatVerifyCode(int n) {
    // 开发一个验证码
    // 定义一变量记录验证码字符
    String code = "";
    String data = "abcdefghijklmnopqrstuvwxyz12345678ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    Random r = new Random();
    for (int i = 0; i < n; i++) {
      // 定义一个循环生成5个随机索引，得到几个字符
      // 获取随机索引对应字符,连接给code
      int index = r.nextInt(data.length());
      code += data.charAt(index);
    }
    return code;
  }
}
