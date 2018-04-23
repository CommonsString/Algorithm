package threadSome;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 * 背包问题
 * 物品可分割情况
 */

class BabyThing{
	public int num; //宝物序号
	public double w; //宝物重量
	public double price; //宝物价值
	public double rate; //性价比
	
	public double jisuanRate(){
		return this.rate = price / w; //   价值/重量
	}
}

public class PackageProblem {
	public static void sortS(List<BabyThing> list){
		Collections.sort(list, new Comparator<BabyThing>(){
			@Override
			public int compare(BabyThing o1, BabyThing o2) {
				if(o1.jisuanRate() > o2.jisuanRate()){
					return -1; //o1 > o2 降序，返回-1表示 我想调整顺序,改为升序
				}
				if(o1.jisuanRate() == o2.jisuanRate()){
					return 0;
				}
				return 1;
			}
		});
	}
	
	public static void main(String[] args) {
		List<BabyThing> list = new ArrayList<BabyThing>();
		
		double n, sumW; //宝物的数量，背包重量
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.println("请输入宝物的数量、以及背包的总容量：");
		n = in.nextDouble();
		sumW = in.nextDouble();
		for(int i = 0; i < n; i++){
			BabyThing temp = new BabyThing();
			System.out.println("输入第" + (i + 1) + "个宝物的重量，价值");
			temp.num = i + 1;
			temp.w = in.nextDouble();
			temp.price = in.nextDouble();
			list.add(temp); //加入
		}
		//按照性价比排序
		sortS(list);
		for(BabyThing o : list){
			System.out.println(o.jisuanRate());
		}
		double maxPrice = 0; //当前最大价值
		for(int j = 0, len = list.size(); j < len; j++){
			if(sumW < list.get(j).w){
				maxPrice = maxPrice + sumW * list.get(j).jisuanRate();
				break;
			}else{
				sumW = sumW - list.get(j).w; //背包剩余重量
				maxPrice = maxPrice + list.get(j).price; //当前最大价值
			}
		}
		System.out.println("装入宝物的最大价值 ：  " + maxPrice);
	}
	
	
}
