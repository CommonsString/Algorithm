package offer;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Goods{
	//宝物序号
	public int num; 
	//物品重量
	@SuppressWarnings("unused")
	private double w;
	//物品的价值
	@SuppressWarnings("unused")
	private double v;
	//物品的性价比
	private double p;
	
	public Goods(double w, double v) {
		this.w = w;
		this.v = v;
		this.p = v / w;
	}

	public double getP() {
		return p;
	}
}

public class PackageProblem {
	
	/**
	 * 利用 容器List compare排序
	 */
	public static void sortGoods(List<Goods> item){
		
		Collections.sort(item, new Comparator<Goods>() {
			@Override
			public int compare(Goods o1, Goods o2) {
				if(o1.getP() > o2.getP()){
					return 1;
				}
				if(o1.getP() == o1.getP()){
					return 0;
				}
				return -1;
			}
		});
		
		
	}
	

}
