import java.util.*;
public class Qest{
	public static void main(String[] args){
		System.out.println("あなたの名前を教えてください");
		String name = new Scanner(System.in).nextLine();
		System.out.println("あなたの年齢を教えてください");
		int age  = new Scanner(System.in).nextInt();
		System.out.println("ようこそ" + age + "歳の" + name + "さん");
	}
}
