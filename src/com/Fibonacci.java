package com;


/**
 *
 * 算法：斐波那契数列
 */
public class Fibonacci {
	
	/*
	public static int fibonacci(int n){
		//参数检查
		if(n < 0) return -1;
		//n = 1, n = 2的情况
		if(n == 1 || n == 2) return 1;
		//递归
		return fibonacci(n - 1) + fibonacci(n - 2);
	}
	*/
	
//	public static int fibonacci(int n){ 
//		//参数检查
//		if(n < 0) return -1;
//		//声明一维数组
//		int[] arr = new int[n];		
//		//初始化
//		arr[0] = 1; //第一项
//		arr[1] = 1; //第二项
//		//第三项开始，对应数组下标2
//		for(int i = 2, len = arr.length; i < len; i++){
//			arr[i] = arr[i - 1] + arr[i - 2];
//		}
//		return arr[n - 1];
//	}
	
//	public static int fibonacci(int n){
//		//参数检查
//		if(n < 0) return -1;
//		int s1 = 1; //第一项
//		int s2 = 2; //第二项
//		for(int i = 3; i <= n; i++){
//			s2 = s1 + s2; //辗转相加
//			s1 = s2 - s1; //记录前一项
//		}
//		return s2;
//	}
	
	
	/*
	 * 求N个数的最小公倍数
	 * 先求出N个数的最大数max,如果这个数可以整除所有的树，即为最小公倍数
	 * 否则，将max+1，继续整除
	 */
	public static int MaxDoubleNum(int...num){
		for(int i = 0, len = num.length; i < len; i++){
			//求出最大数
		}
		return -1;
	}
	
	
	public static int countNum(){
		int n = 7; //记录台阶数,从7开始
		while(!(n % 2 == 1 && n % 3 == 2 && n % 5 == 4 && n % 6 == 5 && n % 7 == 0)){
			n = n + 7; //增加步长7
		}
		return n;
	}
	
	
	
	public static void main(String[] args) {
		System.out.println(countNum());
	}
}
