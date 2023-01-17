package com.itheima.d3_staticDemo1;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @BelongsProject: Javasepro @BelongsPackage: com.itheima.d3_staticDemo1 @Author:
 * LiSiFan @CreateTime: 2023-01-16 22:33 @Description: 单例 @Version: 1.0
 */
public class StaticInstance {
  private static StaticInstance staticInstance = new StaticInstance();




  public static StaticInstance getStaticInstance() {
    //该对象为空 则创造一个对象赋值给它
   return staticInstance;
  }
}
