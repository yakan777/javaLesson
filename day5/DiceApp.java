imeport java.util.*;
public class DiceApp{
	public static void main(String[] args){
		/*
		 * サイコロ振ってそれが偶数か奇数化を判定する
		 （実行結果）
		 4は偶数です。
		 1は奇数です。
		 */
		System.out.println("サイコロを振ります");
		int dice = new Random().nextInt(5)+1;
		System.out.println("dice>>");
		/*if((dice == 1)|| (dice == 3) || (dice==5)){
			System.out.println(dice + "は奇数です"); 
		}else{
			System.out.println(dice + "は偶数です"); 
		}*/
		//int mod = dice % 2;

		if(dice % 2 == 0){
			System.out.println(dice + "は偶数です"); 
		}else{
			System.out.println(dice + "は奇数です"); 
		}
	}
}
