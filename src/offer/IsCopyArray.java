package offer;

import java.util.Scanner;

/**
 * 不修改数组的前提下,找出重复数字
 * 代码分为折半和计数部分
 * @author commonsstring@yeah.net
 * 
 */
public class IsCopyArray {
	
	
	/**
	 * 折半,计数部分
	 */
	public static int isCount(int[] arr, int start, int end){
		//参数检查
		if(arr == null) return -1;
		if(start > end) return -1;
		int count = 0; //计数,数字出现的次数
		//计数开始
		for(int i = 0, len = arr.length; i < len; i++){
			if(arr[i] >= start && arr[i] <= end){
				count++;
			}
		}
		return count;
	}
	
	public static int getDupFunction(int[] arr){
		int start = 1; //起始
		int end = arr.length - 1; //结束
		while(end >= start){
			 //右移
			int middle = ((end - start) >> 1) + start;
			//计数
			int count = isCount(arr, start, middle);
			//首尾相等
			if(end == start){
				if(count > 1){
					return start; //当前数
				}else{
					break;
				}
			}
			//前一段
			int part = middle - start + 1;
			if(count > part){  //满足,说明(start, middle)区间中存在重复数字
				end = middle; //计算下标， (start , middle)
			}else{ //后一段存在重复数字
				start = middle + 1; 
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		
		int n;
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.println("输入数组长度：");
		n = in.nextInt();
		
		if(n < 0) return ;
		int[] arr = new int[n];
		for(int i = 0; i < n; i++){
			System.out.println("请输入数组第" + (i + 1) + "个数：");
			arr[i] = in.nextInt();
		}
		int sub = getDupFunction(arr);
		System.out.println("重复数数字：" + sub);
	}
	
	
	

}
