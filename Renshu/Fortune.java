import java.util.*;
public class Fortune{
	public static void main(String[] args){
		System.out.println("ようこそ占いの館へ");
		System.out.println("あなたの名前を入力してください");
		String name = new Scanner(System.in).nextLine();
		System.out.println("あなたの年齢を入力してください");
		int age = new Scanner(System.in).nextInt();
		int num = new Random().nextInt(4);
		num++;
		System.out.println("占いの結果が出ました！");
		System.out.println(age + "歳の" + name + "さんあなた運勢は" + num + "です♪");
		System.out.println("1:大吉2:中吉3:小吉4:凶");
	}
}
