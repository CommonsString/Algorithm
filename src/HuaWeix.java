import java.util.Scanner;

public class HuaWeix {
	
	
	public static void sayHello(String flag, int start, int end, int[] score){
		if(flag.equals("Q")){
			int endLine = Math.max(start, end);
			int startLine = Math.min(start, end) - 1;
			int max = score[startLine];
			for(int i = start; i < endLine; i++){
				if(score[i] > max){
					max = score[i];
				}
			}
			System.out.println(max);
		}
		if(flag.equals("U")){
			score[start - 1] = end;
		}
	}
	
	
	public static void main(String[] args) {
		
		
		int M = 0, N = 0;
		int A = 0, B = 0;
		
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			N = in.nextInt();
			M = in.nextInt();
			
			int[] score = new int[N];
			for(int i = 0; in.hasNext() && i < N; i++){
				score[i] = in.nextInt();
			}
			
			String c = null;
			for(int j = 0; in.hasNext() && j < M; j++){
				c = in.next();
				A = in.nextInt();
				B = in.nextInt();
				sayHello(c, A, B, score);
			}
		}
		
		
	}

}
