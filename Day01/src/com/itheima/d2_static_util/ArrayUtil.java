package com.itheima.d2_static_util;

/**
 * @BelongsProject: Javasepro
 * @BelongsPackage: com.itheima.d2_static_util
 * @Author: LiSiFan
 * @CreateTime: 2023-01-16  17:43
 * @Description: TODO
 * @Version: 1.0
 */
public class ArrayUtil {
	private ArrayUtil(){};
	static String toString(int[] arr){
		if (arr == null){
			return  null;
		}

		//拼接内容并返回
		String result = "[";
    for (int i = 0; i< arr.length; i++) {
	    result += (i == arr.length-1 ? arr[i]:arr[i]+ ",");
    }
		result += "]";
		return result;
	}
}
