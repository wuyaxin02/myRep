package com.itheima.d1static;

import com.sun.org.apache.bcel.internal.generic.GOTO;

/**
 * @BelongsProject: Javasepro @BelongsPackage: com.itheima.d1static @Author: LiSiFan @CreateTime:
 * 2023-01-15 12:46 @Description: TODO @Version: 1.0
 */
public class Text3 {
  /** 静态成员 */
  public static int onLineNumber = 123;
  /** 实例成员 */
  private String name;

  public static void text2() {
    System.out.println("====tex2====");
  }

  /** 静态方法只能访问静态成员,不可以直接访问实例成员 */
  public static void text() {
    System.out.println(Text3.onLineNumber);
    System.out.println(onLineNumber);
    text2();
  }

  public static void main(String[] args) {
    // 理解static访问相关的语法 面试笔试
    // 静态方法只能访问静态成员，不能直接访问实例成员

    System.out.println();
  }

  public void run() {
    System.out.println(name + "跑步");
  }

  // 实例方法可以访问静态的成员,也可以访问实例成员

  public void go() {
    System.out.println(Text3.onLineNumber);
    System.out.println(onLineNumber);
    text2();
    run();
    System.out.println(name);
    System.out.println(this);
  }

  //静态方法中不可以出现this关键字

  public static void text3() {
//    System.out.println(this);//this只能代表当前对象
  }

  }
