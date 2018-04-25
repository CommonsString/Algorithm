package offer;


/**
 * 替换字符串
 * @author MyPC
 *
 */
public class ChangeString {
	
	public static String change(StringBuilder str){
		//数组原长度
		int startLen = str.length();
		//空格的数量
		int count = 0;
		//统计空格数
		for(int i = 0; i < str.length(); i++){
			if(str.charAt(i) == ' '){
				count++;
			}
		}
		System.out.println("空格数：" + count);
		//加上替换字符后的长度：%20
		int endLen = startLen + count * 2;
		//扩容
		str.setLength(endLen);
		//下标计算
		int start = startLen - 1;
		int newLen = endLen - 1;
		while(start >= 0 && newLen > start){
			//遇到空格
			if(str.charAt(start) == ' '){
System.out.println("遇到空格");
				str.setCharAt(newLen--, '0');
				str.setCharAt(newLen--, '2');
				str.setCharAt(newLen--, '%');
			}else{
System.out.println("没遇到空格");
				str.setCharAt(newLen--, str.charAt(start));
			}
			start--;
		}
		return str.toString();
	}
	
	
	public static void main(String[] args) {
		
		String mane = "we are harry!";
		System.out.println(change(new StringBuilder(mane)));
		
	}
	
	
	

}
