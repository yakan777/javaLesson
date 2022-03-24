import java.util.*;
public class Hung{
	public static void main(String[] arg){
		System.out.println("お腹が空いていますか？");
		System.out.println("はい:１少しだけ:2いいえ:3");
		int hung = new Scanner(System.in).nextInt();
		String food ="ハンバーガー";
		String drink ="コーラ";
		if(hung == 1){
		System.out.println(food + "と" + drink +"をどうぞ");
		}else if(hung == 2){
		System.out.println(drink +"をどうぞ");
		}else{
		System.out.println("さようなら…");
		}
	}
}
