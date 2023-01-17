package com.itheima.d10_extends_constractor;

/**
 * @BelongsProject: Javasepro
 * @BelongsPackage: com.itheima.d10_extends_constractor
 * @Author: LiSiFan
 * @CreateTime: 2023-01-17  18:41
 * @Description: TODO
 * @Version: 1.0
 */
public class Animal {
	public Animal(){
    System.out.println("父类无参数构造器执行");
	}

	private String name;
	private int age;


	public Animal(String name ,int age){
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}



}
