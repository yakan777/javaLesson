public class Rpg{
	public static void main(String[] args){
		String name="ロト";
		int hp=100;
		System.out.println("スライムが出てきた！");
		System.out.println("スライムの先制攻撃");
		System.out.println(name + "は30のダメージをうけた");
		hp = hp - 30;
		System.out.println(name + "(" + hp +")");
		System.out.println("スライムの連続攻撃");
		System.out.println(name + "は100のダメージをうけた");
		hp = hp - 100;
		System.out.println(name + "(" + hp +")");
		System.out.println(name + "は力尽きた");
		System.out.println("Game Over");
		
	}
}
