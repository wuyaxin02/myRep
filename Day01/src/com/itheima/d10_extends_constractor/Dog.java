package com.itheima.d10_extends_constractor;

/**
 * @BelongsProject: Javasepro
 * @BelongsPackage: com.itheima.d10_extends_constractor
 * @Author: LiSiFan
 * @CreateTime: 2023-01-17  18:42
 * @Description: TODO
 * @Version: 1.0
 */
public class Dog extends Animal{
	public Dog(){
		super();
//		super();//默认存在

		//
    System.out.println("子类无参构造器执行");
    //默认会先调父类的无参数构造器
	}
	public Dog(String name,int age){
		//调父类有参构造器，初始化继承来自父类的数据
		super(name ,age);
		System.out.println("子类有参构造器执行");

	}

	public Dog(String name){
		this(name,12);
	}
	}
