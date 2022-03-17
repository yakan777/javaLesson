public class Rpg2{
	public static void main(String[] args){
		String name="スライム";
		int hp=1000;
		System.out.println("ロトが出てきた！");
		System.out.println("ロトの先制攻撃");
		System.out.println(name + "は50のダメージを受けた");
		hp = hp - 50;
		System.out.println(name + "(" + hp +")");
		System.out.println("ロトの連続攻撃");
		System.out.println(name + "は80のダメージを受けた");
		hp = hp - 80;
		System.out.println(name + "(" + hp +")");
		System.out.println("ロトの必殺技！");
		System.out.println(name + "は10000のダメージを受けた");
		hp = hp - 10000;
		System.out.println(name + "(" + hp +")");
		System.out.println(name + "は力尽きた");
		System.out.println("Game Over");
	}
}
