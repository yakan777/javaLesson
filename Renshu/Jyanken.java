import java.util.*;
public class Jyanken{
	public static void main(String[] args){
		System.out.println("手を入力(グー１:チョキ2:パー3:");
		int hand = new Scanner(System.in).nextInt();
		int pc = new Random().nextInt(3)+1;
		String g = "グー"; 
		String c = "チョキ"; 
		String p = "パー";
		if(hand == 1 && pc == 2){
			System.out.println("あなたは" + g + "相手は" + c + "あなたの勝ち");
		}else if(hand == 1 && pc == 3){
			System.out.println("あなたは" + g + "相手は" + p + "あなたの負け");
		}else if(hand == 2 && pc == 1){
			System.out.println("あなたは" + c + "相手は" + g + "あなたの負け");
		}else if(hand == 2 && pc == 3){
			System.out.println("あなたは" + c + "相手は" + p + "あなたの勝ち");
		}else if(hand == 3 && pc == 1){
			System.out.println("あなたは" + p + "相手は" + g + "あなたの勝ち");
		}else if(hand == 3 && pc == 2){
			System.out.println("あなたは" + p + "相手は" + c + "あなたの負け");
		}else{
			System.out.println("あいこです");
		}


	}
}
