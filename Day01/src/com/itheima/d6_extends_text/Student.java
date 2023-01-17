package com.itheima.d6_extends_text;

/**
 * @BelongsProject: Javasepro
 * @BelongsPackage: com.itheima.d6_extends_text
 * @Author: LiSiFan
 * @CreateTime: 2023-01-17  15:21
 * @Description: TODO
 * @Version: 1.0
 */
public class Student extends People{
	/**
	 * 独有行为
	 * */
	public void writeInfo(){
    System.out.println(getName()+"写了一首诗");
	}

}
