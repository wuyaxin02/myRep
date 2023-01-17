package com.itheima.d2_static_util;

import java.util.Random;

/**
 * @BelongsProject: Javasepro @BelongsPackage: com.itheima.d2_static_util @Author:
 * LiSiFan @CreateTime: 2023-01-16 16:00 @Description: TODO @Version: 1.0
 */
public class Check {
  public static void main(String[] args) {
    // 开发一个验证码
    // 定义一变量记录验证码字符
    String code = "";

    String data = "abcdefghijklmnopqrstuvwxyz12345678ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    Random r = new Random();
    for (int i = 0; i < 5; i++) {
      // 定义一个循环生成5个随机索引，得到几个字符
      // 获取随机索引对应字符,连接给code
      int index = r.nextInt(data.length());
      code += data.charAt(index);
    }
    System.out.println("验证码"+ code);
  }
}
