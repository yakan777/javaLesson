import java.util.*;
public class Four11{
	public static void main(String[] args){
		System.out.print("数字をカンマ区切りで入力>");
		String num =new Scanner(System.in).next();
		String[] data =num.split(",");
		int[] nums =new int[data.length];
		int max =0;
		int min =0;
		for(int i=0; i<data.length;i++){
			nums[i]=Integer.parseInt(data[i]);
		min =nums[0];
			max=Math.max(max,nums[i]);
			min=Math.min(min,nums[i]);
		}
		if(max==min){
			System.out.println();
		}else{
		System.out.printf("もっとも大きい数字は%dです%n",max);
		System.out.printf("もっとも小さい数字は%dです%n",min);
		}
	}
}
