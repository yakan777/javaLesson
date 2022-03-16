public class Hensu{
	public static void main(String[] args){
	  //変数宣言(Integer:整数)
		int money;
		money=100;
		System.out.println("所持金:" + money);
		System.out.println("50円拾った");
		money = money + 50;
		System.out.println("所持金:" + money);
		System.out.println("千円お小遣いもらった");
		money = money + 1000;
		System.out.println("所持金:" + money);	
		System.out.println("500円牛丼食べた");
		money = money - 500;
		System.out.println("所持金:" + money);	
	}
}
