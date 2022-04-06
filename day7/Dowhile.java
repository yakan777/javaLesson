import java.util.*;
public class Dowhile{
	public static void main(String[] args){
		/*
		System.out.println("現在の室温>>");
		int temp = new Scanner(System.in).nextInt();
		do{
			System.out.println("室温を一度下げました");
			temp--;
			System.out.println("室温:" + temp);
		}while(temp > 20);
		*/
		int n;
		do{
			System.out.println("正の整数");
			n = new Scanner(System.in).nextInt();
		}while(n <= 0);
		System.out.println(n + "が入力されました");
	}
}
