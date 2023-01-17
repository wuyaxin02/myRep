package com.itheima.d3_staticDemo1;

/**
 * @BelongsProject: Javasepro
 * @BelongsPackage: com.itheima.d3_staticDemo1
 * @Author: LiSiFan
 * @CreateTime: 2023-01-16  18:53
 * @Description: TODO
 * @Version: 1.0
 */
public class StaticDemo2 {

	public StaticDemo2(){
    System.out.println("无参构造器触发执行");
	}

	//实例代码块 （构造代码块）  初始化实例资源
	{
    System.out.println("实例代码块被触发执行");
	}

  public static void main(String[] args) {
	  StaticDemo2 s1 = new StaticDemo2();
  }
}
