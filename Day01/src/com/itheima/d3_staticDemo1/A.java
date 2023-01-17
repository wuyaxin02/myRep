package com.itheima.d3_staticDemo1;

import sun.security.action.GetBooleanAction;

/**
 * @BelongsProject: Javasepro
 * @BelongsPackage: com.itheima.d3_staticDemo1
 * @Author: LiSiFan
 * @CreateTime: 2023-01-16  23:11
 * @Description: 饿汉单例
 * @Version: 1.0
 */
public class A {
	//提前准备好一个对象
	public static A a =new A();
//int a=9;
	//构造器私有化
	private A(){
    System.out.println("a");
	}

//	public static void GetA(){
//		return;
//
//	}

}
