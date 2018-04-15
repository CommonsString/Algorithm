package com;

import java.util.Arrays;

//插入排序之直接插入排序
public class InsertionSort {
	
	
	public static void main(String[] args) {
		int[] arr = {3, 2, 1, 5, 4, 0};
		show(arr);
//		insertionSort2(arr);
//		System.out.println(Arrays.toString(arr));
		
	}
	
	public static void insertionSort(int[] arr){
		if(arr.length < 0){
			throw new RuntimeException();
		}
		
		for(int i = 0, len = arr.length - 1; i < len; i++){
			for(int j = i + 1; j > 0; j--){
				if(arr[j - 1] <= arr[j]) break; //后面的数小于前面，排好序，中断
				int temp = arr[j];
				arr[j] = arr[j - 1];
				arr[j - 1] = temp;
			}
		}
	}
	
	public static void insertionSort2(int[] arr){
		if(arr.length < 0){
			throw new RuntimeException();
		}
		
		for(int i = 1; i <= arr.length - 1; i ++){
			int temp = arr[i]; //记录未排序区第一个元素
			int j = i - 1; //记录排序区的最后一个元素
			for(; j >= 0 && temp < arr[j]; j--){
				arr[j + 1] = arr[j]; //插入
			}
			//前面j--
			arr[j + 1] = temp; //将保存的值放入arr[j]
		}
	}
	
	public static void show(int[] arr){
		
		for(int i = 0, len = arr.length - 1; i < len; i++){
			System.out.print(arr[i] + "\t");
		}
		System.out.println();
	}

}
