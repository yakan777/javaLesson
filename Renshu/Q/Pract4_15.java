import java.util.*;
public class Pract4_15{
	public static void main(String[] args){
		System.out.print("数字をカンマ区切りで入力");
		String num =new Scanner(System.in).next();
		int result = result(num);
		System.out.print(result +"年は");
		is(result);
	}
	static int result(String num){
		String[] data=num.split(",");
                String result=String.join("",data);
	        int n =Integer.parseInt(result);
		return n;
	}
	static void is(int year){
		if(year%400==0 || year%4==0 && year %100!=0){
			System.out.print("うるう年");
		}else{
			System.out.print("うるう年ではありません");
		}
	}
}
