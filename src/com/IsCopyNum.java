package com;

import java.util.Scanner;

/**
 * 一纬数组中查找重复数字
 * @author commonsstring@yeah.net
 *
 */
public class IsCopyNum {
	
	public static void main(String[] args) {
		int n;
		Scanner in = new Scanner(System.in);
System.out.println("请输入数组长度： ");
		n = in.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++){
System.out.println("请输入第" + (i + 1) + "个数字");
			arr[i] = in.nextInt();
		}
		
		boolean result = getCopyNum(arr);
System.out.print("是否存在重复数字： ");		
System.out.print(result == true? "存在!" : "不存在！");
	}
	
	
	/**
	 * 利用数组下标特性,找出是否存在重复数据
	 */
	public static boolean getCopyNum(int[] arr){
		//参数判断
		if(arr == null ) return false;
		int len = arr.length;
		//输入参数判断
		for(int i = 0; i < len; i++){
			//违法数字
			if(arr[i] < 0 || arr[i] > len - 1){
				return false;
			}
		}
		for(int j = 0; j < len; j++){
			while(arr[j] != j){
				//存在重复数字
				if(arr[j] == arr[arr[j]]){
					return true;
				}
				int temp = arr[j];
				arr[j] = arr[temp];
				arr[temp] = arr[j];
			}
		}
		return false;
	}
}
