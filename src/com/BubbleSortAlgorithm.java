package com;


import org.junit.Test;

/*
 * 冒泡排序
 * 
 */
public class BubbleSortAlgorithm {
	
	
	
	
	@Test
	public void testDubbleSort(){

		int[] n = {4 , 1, 3, 2, 5};
		BobbleSort3(n);
		show(n);
		
	}
	
	public static int count = 0;
	public static int count2 = 0;
	/**
	 * 版本一：排好序后，结果都一样重复排序多次
	 */
	public void BobbleSort(int[] arr){
		if(arr.length < 0){
			throw new RuntimeException();
		}
		for(int i = 0, len1 = arr.length - 1; i < len1; i++){ //控制循环次数
			for(int j = 0, len2 = arr.length - i - 1; j < len2; j++){
				count++;
				if(arr[j] > arr[j + 1]){ //不满足升序，交换位置
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
				
				//打印结果：
System.out.println("第" + count + "轮排序结果:");
				show(arr);
		}
	}
}
	/**
	 * 对于一个本身有序的序列，或者序列后面一大部分都是有序的序列，算法一会造成很多时间开销。
	 * 优化，利用一个标记变量，标记是否继续下一轮排序
	 * 显然，如果有一次没有发生交换，说明排序已经完成。
	 * @param arr
	 */
	/**
	 * @param arr
	 */
	public void BobbleSort2(int[] arr){
		if(arr.length < 0){
			throw new RuntimeException();
		}
		
		boolean flag = false; //设置标记,表示该轮排序后就不需要再排。
		for(int i = 0, len = arr.length - 1; i < len; i++){
			for(int j = 0, len2 = arr.length - i - 1; j < len2; j++){
				count2++;
				if(arr[j] > arr[j + 1]){
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					flag = true; //有元素位置交换，表示下一轮还需要比较排序
				}
			}
//System.out.println("第" + count2 + "轮排序结果:");
//				show(arr);
				if(!flag) break; //下一轮不需要排序，断开。
		}
	}
	
	
	/**
	 * 在整个数列排好后，没必要在进行多余的比较了。 
	 * 增加一个位置变量，记录每次冒泡的最后交换位置，下次比较此处就可以了。
	 */
	@SuppressWarnings("unused")
	public void BobbleSort3(int[] arr){
		if(arr.length < 0){
			throw new RuntimeException();
		}
		
		int index = arr.length - 1; //记录最后一次交换位置
		boolean flag = false; //记录是否要继续排序。
		for(int i = 0, len = arr.length - 1; i < len; i++){
			for(int j = 0, len1 = arr.length - i - 1; j < len1; j++){
				if(arr[j] > arr[j + 1]){
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					flag = true;
					index = j; //记录最后一次交换位置
				}
			}
//			show(arr);
			if(!flag) break; //下一轮不需要排序，断开。
		}
	}
	
	
	private void show(int[] arr) {
		for(int val : arr){
			System.out.print(val + "\t");
		}
		System.out.println();	
	}
		
}
