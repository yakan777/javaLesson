import java.util.*;
public class ForLesson{
	public static void main(String[] args){
		System.out.println("小さい数");
		int min = new Scanner(System.in).nextInt();
		System.out.println("大きい数");
		int max = new Scanner(System.in).nextInt();
		for(int i=min;i<=max;i++){
			sum += i;
			System.out.println(min + "から" + " までの和は" + sum + "です");
		}
	}
}
