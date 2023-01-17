package com.itheima.d1static;

/**
 * @BelongsProject: Javasepromax
 * @BelongsPackage: com.itheima.d1 static
 * @Author: LiSiFan
 * @CreateTime: 2023-01-14  13:34
 * @Description: 静态成员变量
 * @Version: 1.0
 */
class StaticFiledDemo1 {
	public static void main(String[] args) {
		//理解static修饰成员变量的作用和访问特点
		System.out.println(User.onLineNumber);
		User u = new User();
//		u.onLineNumber++;//不推荐

	}
}
