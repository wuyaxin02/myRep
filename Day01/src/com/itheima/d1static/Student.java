package com.itheima.d1static;

/**
 * @BelongsProject: Javasepro @BelongsPackage: com.itheima.d1static @Author: LiSiFan @CreateTime:
 * 2023-01-14 21:17 @Description: TODO @Version: 1.0
 */
public class Student {
  /** 实例成员方法 无static修饰 归属于对象 */
  public String name;
  /** 对象.实例方法 */
  Student s = new Student();
//  s.name = "小孩";
//  s.study


  /** 静态成员方法 有static修饰 归属于类 可以被共享访问 建议用类名访问 */
  public static int getMax(int age1, int age2) {
    return age1 > age2 ? age1 : age2;
  }

  public static void main(String[] args) {
    System.out.println(Student.getMax(10, 4));
    // 在同一个类中，静态方法的访问 类名可省略
    System.out.println(getMax(10, 4));
  }

  /** 实例成员方法属于对象，只能用对象触发访问 */
  public void study() {
    System.out.println(name + "正在学习");
  }
}
