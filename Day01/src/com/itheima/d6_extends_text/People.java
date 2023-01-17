package com.itheima.d6_extends_text;

/**
 * @BelongsProject: Javasepro @BelongsPackage: com.itheima.d6_extends_text @Author:
 * LiSiFan @CreateTime: 2023-01-17 15:21 @Description: TODO @Version: 1.0
 */
public class People {
  private String name;
  private int age;

  public void queryCourse() {
    System.out.println(name + "在查看课表");
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public int getAge() {
    return age;
  }
}
