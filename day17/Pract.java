import java.util.*;
public class Pract{
	public static void main(String[] args){
		System.out.print("マイル>");
		double n =new Scanner(System.in).nextDouble();
		double result = calcResult(n);
		System.out.printf("%.0fマイルは%.1fキロ%n",n,result);

		System.out.print("段を入力");
		int num =new Scanner(System.in).nextInt();
		printLine(num);

		System.out.print("整数を入力>");
		int oddEven =new Scanner(System.in).nextInt();
		result(oddEven);

		System.out.print("九九の段を入力>");
		int qq =new Scanner(System.in).nextInt();
		result2(qq);
	}
	static double calcResult(double a){
		double result = a * 1.6;
		return result;
	}
	static void printLine(int n){
		for(int i =0;i<n;i++){
			for(int j =0;j<i+1;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
	static void result(int o){
			System.out.printf("%dは%sです%n",o,o%2==0?"偶数":"奇数");
	}
	static void result2(int qq){
		for(int i =1;i<=9;i++){
			System.out.println(qq*i);
		}
	}
}
