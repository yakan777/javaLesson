import java.util.*;
public class Method4_12{
	public static void main(String[] args){
		System.out.print("数字をカンマ区切りで入力");
		String num =new Scanner(System.in).next();
		strResult(num);
	}
	static void strResult(String num){
		String[] nums=num.split(",");
		int[] n =new int [nums.length];
		int sum =0; 
		for(int i =0;i<nums.length;i++){
			n[i]=Integer.parseInt(nums[i]);
			sum+=n[i];
		}
		double avg =(double)sum/nums.length;
		System.out.printf("平均は%.2f",avg);
	}
		
}
