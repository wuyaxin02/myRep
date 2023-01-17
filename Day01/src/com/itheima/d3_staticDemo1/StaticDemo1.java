package com.itheima.d3_staticDemo1;

import java.util.ArrayList;

/**
 * @BelongsProject: Javasepro
 * @BelongsPackage: com.itheima.d3_staticDemo
 * @Author: LiSiFan
 * @CreateTime: 2023-01-16  18:31
 * @Description: TODO
 * @Version: 1.0
 */
public class StaticDemo1 {
	private static String name;
public static ArrayList<String> cards = new ArrayList<>();
	/**
	 * 静态代码类 有static修饰属于类，与类一起优先加载一次，自动触发执行
	 * 作用：可用于初始化静态资源
	 * */
	static {
    System.out.println("===静态代码块触发执行了===");
    name = "小白";
    cards.add("3");
    cards.add("4");
	}

  public static void main(String[] args) {
    //
    System.out.println("main方法执行");
  }
}
