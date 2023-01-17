package com.itheima.d7_evtends_feature;

/**
 * @BelongsProject: Javasepro @BelongsPackage: com.itheima.d7_evtends_feature @Author:
 * LiSiFan @CreateTime: 2023-01-17 16:45 @Description: TODO @Version: 1.0
 */
public class Test {
  public static void main(String[] args) {
    // 继承特点
    // 有争议：子类可以继承父类私有成员但不可直接访问   继承了只是用不了，只有暴力访问
    Tiger t = new Tiger();
    //    eat();
    System.out.println(Tiger.location);
  }
}

class Animal {
  public void eat() {
    System.out.println("动物吃东西");
  }
  public static String location = "动物园";
}

class Tiger extends Animal{}
