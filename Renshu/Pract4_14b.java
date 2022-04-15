import java.util.*;
public class Pract4_14b{
	public static void main(String[] args) throws Exception{
		System.out.print("数字をカンマ区切りで入力");
		String nums =new Scanner(System.in).next();
		Result(nums);
	}
	public static void Result(String nums){
		int min=0;
		String[] data=nums.split(",");
		int[] n =new int[data.length];
		for(int i =0;i<data.length;i++){
			n[i]=Integer.parseInt(data[i]);
			min=n[0];
			min =Math.min(min,n[i]);
		}
		System.out.println("一番小さい数字は"+min);
	}
}
