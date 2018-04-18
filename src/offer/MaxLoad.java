package offer;

import java.util.Arrays;
import java.util.Scanner;

public class MaxLoad {
	public static int loadNumber(int[] arr, int c){
		//参数检查
		if(arr == null || c < 0) return -1;
		//装入古董数
		int count = 0;
		//当前容量
		int temp = 0;
		for(int i = 0; i < arr.length; i++){
			temp += arr[i];
			if(temp <= c){
				count++;
			}
		}
		return count;
	}
	
	/**
	 * 实现二
	 */
	public static int loadNumber2(int[] arr, int c){
		//参数检查
		if(arr == null || c < 0) return -1;
		//记录已经装载的古董数
		int count = arr.length;
		//当前容量
		int temp = 0;
		for(int i = 0, len = arr.length; i < len; i++){
			temp += arr[i];
			if(temp >= c){
				//刚好满，最后一个可以装入
				if(temp == c){
					count = i + 1;
				}else{ //大于,则最后一个不可装入
					count = i;
				}
				break;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		int n;
		//容量
		int c;
		Scanner in = new Scanner(System.in);
		System.out.println("输入抢到的古董数：");
		n = in.nextInt();
		System.out.println("输入船的容量：");
		c = in.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++){
			System.out.println("输入第" + (i + 1) + "古董的重量");
			arr[i] = in.nextInt();
		}
		
		//排序
		Arrays.sort(arr);
		System.out.println("排序后数组：" + Arrays.toString(arr));
		int count = loadNumber(arr, c);
		System.out.println("装入古董数：" + count);
		
	}
	
	
	
}
