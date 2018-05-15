import java.util.Arrays;
import java.util.Scanner;

public class huawei {
	
	
	public static double getMax(double[] arr){
		Arrays.sort(arr);
		return arr[arr.length - 1];
	}
	
	public static double getMaxs(double[] arr){
		return 0;
		
	}
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		//第一行
		int N, M;
		N = in.nextInt();
		M = in.nextInt();
//		System.out.println(N + "  " + M);
		//第二行
		double[] score = new double[N];
		for(int i = 0; i < N; i++){
			score[i] = in.nextDouble();
		}
//		System.out.println(Arrays.toString(score));
		//第三行
		while(true){
			StringBuilder str = new StringBuilder();
			str.append(in.nextLine());
			System.out.println(str.toString());
			for(int j = 0; j < str.length(); j++){
				//操作
				if(str.charAt(j) == 'Q'){
					//索引
					double max = getMax(score);
					System.out.println(max);
				}
				if(str.charAt(j) == 'U'){
					int index = str.charAt(j + 1);
					double scores = str.charAt(j + 2);
					
					System.out.println(index + " 索引 ");
					System.out.println(scores + "分数");
//					score[index] = scores;
				}				
			}
		}
	}
	
	

}
