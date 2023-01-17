package com.itheima.d2_static_util;

import java.lang.reflect.Array;
import java.util.Scanner;

/**
 * @BelongsProject: Javasepro
 * @BelongsPackage: com.itheima.d2_static_util
 * @Author: LiSiFan
 * @CreateTime: 2023-01-16  17:07
 * @Description: TODO
 * @Version: 1.0
 */
public class Login {
  public static void main(String[] args) {
    // 调用验证码
	  checkUtil.creatVerifyCode(5);

	  int[] arr = {11,12,13};

    System.out.println(ArrayUtil.toString(arr));
  }
  }
