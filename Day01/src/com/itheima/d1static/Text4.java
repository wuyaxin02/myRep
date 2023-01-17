package com.itheima.d1static;

import com.itheima.d3_staticDemo1.A;

/**
 * @BelongsProject: Javasepro
 * @BelongsPackage: com.itheima.d1static
 * @Author: LiSiFan
 * @CreateTime: 2023-01-16  23:24
 * @Description: TODO
 * @Version: 1.0
 */
public class Text4 {
	public static void main(String[] args) {
		//类名.静态成员变量
		System.out.println(User.onLineNumber);
		//在同一个类中，静态成员变量的访问 类名可省略

		//对象名.实例成员变量
		User u = new User();
		u.name = "小白";
		u.age = 24;
		System.out.println(u.name);
		System.out.println(u.age);

//		u.onLineNumber++; //<html>不应该通过类实例访问静态成员<br/>com.itheima.d1static.User.onLineNumber
		User.onLineNumber++;
		System.out.println(User.onLineNumber);


		A a1 = A.a;
		A a2 = A.a;
    System.out.println(a1==a2);
	}
}
