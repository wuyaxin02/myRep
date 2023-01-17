package com.itheima.d8_extends_Filed_Method;

/**
 * @BelongsProject: Javasepro @BelongsPackage: com.itheima.extends_Filed_Method @Author:
 * LiSiFan @CreateTime: 2023-01-17 17:35 @Description: TODO @Version: 1.0
 */
public class Text {
  public static void main(String[] args) {
    // 继承后的访问特点 就近原则
    Dog d = new Dog();
    d.run(); // 优先访问子类的
    d.lookDoor();
    d.showName();
  }
}

class Animal {
  public String name = "动物名字";

  public void run() {
    System.out.println("动物可以跑");
  }
}

class Dog extends Animal {
  public String name = "狗名字";

  public void lookDoor() {
    System.out.println("狗可以看门");
  }

  public void showName() {
    String name = "局部名";
    System.out.println(name);
    // 当前子对象的name
    System.out.println(this.name);
    System.out.println(super.name);
    super.run();
  }

  @Override
  public void run() {
    System.out.println("狗跑的快");
  }
}
