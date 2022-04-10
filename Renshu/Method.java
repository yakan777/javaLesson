import java.util.*;
public class Method{
	public static void main(String[] args){
		System.out.print("数字をカンマ区切りで入力>");
		String num =new Scanner(System.in).next();
		int[] data = dataArr(num);
		boolean isSame= isSame(data);
		if(isSame){
			System.out.println("要素はすべて等しい");
		}else{
			System.out.println("要素は等しくない");
		}
	}
	public static int[] dataArr(String num){
		String[] data= num.split(",");
		int[] n = new int[data.length];
		for(int i =0;i<data.length;i++){
			n[i] = Integer.parseInt(data[i]);
		}
		return n;
		
	}
	public static boolean isSame(int[] arr){
		int data=arr[0];
		for(int i =0;i<arr.length;i++){
			if(data != arr[i]){
				return false;
			}
		}
		return true;
	}

}
