import java.util.*;
public class Method4_12_3{
	public static void main(String[] args){
		//Scanner scan =new Scanner(System.in);
		System.out.print("記号を入力>");
		String num1 = new Scanner(System.in).next();
		System.out.print("数字を入力>");
		int num2 = new Scanner(System.in).nextInt();
		result(num1,num2);
	}
	static void result(String a,int b){
		char c=a.charAt(0);
		for(int i =0;i<b;i++){
			for(int j =0;j<i+1;j++){
				System.out.print(c);
			}
			System.out.println();
		}
	}
}
