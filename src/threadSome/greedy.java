package threadSome;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 贪心算法
 * 船重量为C = 30
 * 古董重量为 4 10 7 11 3 5 14 2
 */
public class greedy {
	
	public static void main(String[] args) {
		
		int[] w = new int[100];
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.println("请输入容量c 以及古董的个数n : ");
		double c = in.nextDouble();
		int n = in.nextInt();
		System.out.println("请输入每个古董的重量 ：");
		for(int i = 0; i < n; i++){
			w[i] = in.nextInt();
		}
		
		int ans = 0; //盛装古董的数量
		int sum = 0; //总量
		Arrays.sort(w); //装
		for(int i = 0, len = n; i < len; i++){
			sum += w[i];
			if(sum <= c){
				ans++;
			}else{
				break;
			}
		}
		
		System.out.println(ans);
	}
}
