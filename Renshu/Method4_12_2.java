import java.util.*;
public class Method4_12_2{
	public static void main(String[] args){
		System.out.print(">");
		String num =new Scanner(System.in).next();
		result(num);
		System.out.print(">");
		String num2 =new Scanner(System.in).next();
		result(num2);
	}
	static void result(String num){
		String[] data=num.split(",");
		int[] n =new int[data.length];
		int max=0;
		for(int i=0;i<data.length;i++){
			n[i]=Integer.parseInt(data[i]);
			max=Math.max(max,n[i]);
		}
			System.out.println(Arrays.toString(n) +"の中でもっとも大きい数字は"+max);
	}
}
