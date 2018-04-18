package offer;

public class isCopyArr {
	
	
	
	/**
	 * 空间换时间
	 */
	public static void main(String[] args) {
		
		int[] arr = {2, 3, 5, 4, 3, 2, 6, 7};
		int[] tempArr = new int[arr.length + 1];
		
		for(int i = 1; i <= arr.length; i++){
			if(tempArr[arr[i]] != arr[i]){
				tempArr[arr[i]] = arr[i];
			}else{
				System.out.println("重复数字：" + arr[i]);
			}
		}
	}
	

}
