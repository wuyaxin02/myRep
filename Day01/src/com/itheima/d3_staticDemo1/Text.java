package com.itheima.d3_staticDemo1;

/**
 * @BelongsProject: Javasepro
 * @BelongsPackage: com.itheima.d3_staticDemo1
 * @Author: LiSiFan
 * @CreateTime: 2023-01-16  22:36
 * @Description: TODO
 * @Version: 1.0
 */
public class Text {

  public static void main(String[] args) {
	  StaticInstance s1 = StaticInstance.getStaticInstance();
	  StaticInstance staticInstance1 = new StaticInstance();
	  StaticInstance staticInstance = StaticInstance.getStaticInstance();
	  System.out.println(s1 == staticInstance);


  }
}
