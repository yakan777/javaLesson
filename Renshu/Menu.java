import java.util.*;
public class Menu{
	public static void main(String[] arg){
		System.out.println("【メニュー】1:検索2:登録3:削除4:変更>");
		int menu = new Scanner(System.in).nextInt();
		switch(menu){
			case 1:
				System.out.println("検索します");
				break;
			case 2:
				System.out.println("登録します");
				break;
			case 3:
				System.out.println("削除します");
				break;
			case 4:
				System.out.println("変更します");
				break;
		}
	}
}
