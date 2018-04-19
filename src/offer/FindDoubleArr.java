package offer;

public class FindDoubleArr {
	
	
	/**
	 * 
	 */
	public static boolean findNumber(int[][] arr, int num){
		//参数检查
		if(arr == null) return false;
		//查找标志
		boolean success = false;
		//右上角数值的行
		int tempRow = 0;
		//右上角数值的列
		int tempColumn = arr[0].length - 1;
		while(tempRow > 0 && tempColumn >= 0){
			if(arr[tempRow][tempColumn] == num){
				success = true;
				break;
			}else if(arr[tempRow][tempColumn] < num){
				tempRow++;
			}else if(arr[tempRow][tempColumn] > num){
				tempColumn--;
			}else{
				return false;
			}
		}
		return success;
	}
	

}
