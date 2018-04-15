package com;

import java.util.Arrays;

public class ShellSortAlgotithm {
	
	
	public static void main(String[] args) {
		int[] arr = {2, 1, 4, 9, 5};
		sellSortOne(arr);
		System.out.println(Arrays.toString(arr));
	}
	

	public static void sellSortOne(int[] arr){
		//计算出步长
		int gap = 1; //步长
		int i, j;
		while(gap < arr.length / 3) 
			gap = gap * 3 + 1; //计算步长序列
		
		for(; gap > 0; gap = gap / 3) //边界，步长减少,结合图表观看
			for(i = gap; i < arr.length; i++){
				int temp = arr[i]; //记录第一列，第Gap个元素
				for(j = i - gap; j >= 0 && arr[j] > temp; j -= gap){ //arr[j]第一列第1个元素
					//如果j > 0, 前面大于后面，逆序，
					arr[j + gap] = arr[j]; //arr[j + gap] 前一个元素(大)， 赋值给后一个元素(小)
				}
				//j = j - gap
				arr[j + gap] = temp; //前面保存的小的元素,保存到第一列第一个位置
			}
	}
	
}
