package offer;


/**
 * 替换字符串
 * @author MyPC
 *
 */
public class ChangeString {
	
	public static String change(char[] str){
		//数组原长度
		int startLen = str.length;
		//空格的数量
		int count = 0;
		//统计空格数
		for(int i = 0; i < str.length; i++){
			if(str[i] == ' '){
				count++;
			}
		}
		//加上替换字符后的长度：%20
		int endLen = startLen + count * 3;
		//创建零时数组
		char[] temp = new char[endLen];
		//下标计算
		int start = startLen - 1;
		int newLen = endLen - 1;
		while(start >= 0 && newLen > start){
			
			
		}
		
		return null;
	}
	
	
	public static void main(String[] args) {
		
		String mane = "%20";
		System.out.println(mane.length());
		
	}
	
	
	

}
