package com.itheima.d10_extends_constractor;

/**
 * @BelongsProject: Javasepro @BelongsPackage: com.itheima.d10_extends_constractor @Author:
 * LiSiFan @CreateTime: 2023-01-17 18:37 @Description: TODO @Version: 1.0
 */
public class Text {
  public static void main(String[] args) {
    // 认识继承后子类构造器的特点
    // 特点子类全部构造器会先访问父类的无参数构造器再执行自己的内容
    //
    Dog d1 = new Dog();
    Dog d2 = new Dog("金毛",12);
    System.out.println(d1);
    System.out.println(d2);

    System.out.println(d1.getAge());
    System.out.println(d2.getAge());
  }
}
