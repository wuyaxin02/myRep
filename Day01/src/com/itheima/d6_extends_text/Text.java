package com.itheima.d6_extends_text;

/**
 * @BelongsProject: Javasepro @BelongsPackage: com.itheima.d6_extends_text @Author:
 * LiSiFan @CreateTime: 2023-01-17 15:20 @Description: TODO @Version: 1.0
 */
public class Text {
  public static void main(String[] args) {
    // 继承
    Student s = new Student();
    s.setName("小白");
    s.setAge(23);
    System.out.println(s.getName());
    System.out.println(s.getAge());
    s.queryCourse();
    s.writeInfo();
  }
}
