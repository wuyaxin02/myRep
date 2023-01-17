package com.itheima.d9_extends_overide;

/**
 * @BelongsProject: Javasepro @BelongsPackage: com.itheima.d9_extends_overide @Author:
 * LiSiFan @CreateTime: 2023-01-17 17:59 @Description: TODO @Version: 1.0
 */
public class Text {
  public static void main(String[] args) {
    // 方法重写
	  NewPhone hw = new NewPhone();
	  hw.sendMsg();
	  hw.call();
  }
}

class phone {
  public void call() {
    System.out.println("打电话");
  }

  public void sendMsg() {
    System.out.println("发短信");
  }
}

class NewPhone extends phone {
  @Override
  /**
  @Override 重写注释放在重写后的方法上，作为重写是否正确的校验注解
   提高程序可读性，安全性，重写错误会有提示

   注意：重写方法名称和形参列表 必须与被重写方法的一致
        私有方法不能被重写
        重写的方法权限必须与父类相等或大于父类 private最小之后是不写public最大
   */
  public void call() {
    super.call();
    System.out.println("视频通话");
  }
  @Override
  public void sendMsg(){
  	super.sendMsg();
    System.out.println("发图");
  }
}
