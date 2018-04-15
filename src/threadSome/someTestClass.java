package threadSome;

import java.util.ArrayList;
import java.util.Scanner;
/**
*    public class ListNode {
*        int val;
*        ListNode next = null;
*
*        ListNode(int val) {
*            this.val = val;
*        }
*    }
*
*/

class ListNode{
	int val;
	ListNode next = null;
	
	ListNode(int val){
		this.val = val;
	}
}


public class someTestClass {
	
	/**
	 * 
	 * 算法：
	 * 遍历字符串，将数字字符推进StringBuilder
	 * 推进前，记录每段数字的长度：
	 * 		判断，是数字字符，计数器加一，当遇到不少字符或空是，将计数器推入list
	 * 取出计数器，利用substring方法，获取对应的数据，并存入数组
	 * 数组排序，Arrays.sotr(),取出最大数输出
	 * 		 
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		StringBuilder str = new StringBuilder();
		String str2 = new String();
		str2 = in.nextLine();
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		if("".equals(str2) || str2 == null) return ;
		for(int i = 0; i < str2.length(); i++){
			int temp = 0;
			char val = str2.charAt(i);
			if(val >= '0' && val <= '9'){
				str.append(val);
				temp++;
			}
		}
	}
	
	
/*	*//**
	 * 利用栈特性
	 * @return
	 *//*
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
    	Stack<Integer> stack = new Stack<Integer>();
    	//遍历链表
    	while(listNode != null){
    		stack.push(listNode.val);
    		listNode = listNode.next;
    	}
    	ArrayList<Integer> list = new ArrayList<Integer>();
    	while(!stack.isEmpty()){
    		list.add(stack.pop());
    	}
		return list;
    }
    
    *//**
     * 递归实现
     *//*
    ArrayList<Integer> list = new ArrayList<Integer>();
    public ArrayList<Integer> printListFromTailToHead2(ListNode listNode) {
    	//记录头结点
    	if(listNode != null){
    		this.printListFromTailToHead(listNode.next);
    		list.add(listNode.val); //最后一个递归点，加入值
    	}
    	return list;
    }*/
    
    
    
    
    
}
