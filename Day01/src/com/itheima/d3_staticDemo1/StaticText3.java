package com.itheima.d3_staticDemo1;

import java.util.ArrayList;

/**
 * @BelongsProject: Javasepro @BelongsPackage: com.itheima.d3_staticDemo1 @Author:
 * LiSiFan @CreateTime: 2023-01-16 19:05 @Description: TODO @Version: 1.0
 */
public class StaticText3 {
  public static ArrayList<String> cards = new ArrayList<>();

  static {
  	String[] size = {"3","4","5","6","7","8","9","j","Q","K"};
  	String[] colors = {"♥️","♦️","♣️","♠️"};
    for (int i = 0; i < size.length; i++) {
      // size[i]
      for (int j = 0; j < colors.length; j++) {
        //colors[j]
	      String card = size[i] +colors[j];
	      cards.add(card);
      }
    }
    cards.add("🃏");
    cards.add("大🃏");
	  System.out.println(cards);
  }
  public static void main(String[] args) {
    // 初始化54张卡牌
    System.out.println("新牌"+cards);
  }
}
