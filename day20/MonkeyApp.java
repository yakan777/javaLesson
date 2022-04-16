import java.util.*;
public class MonkeyApp{
	public static void main(String[] args){
		Monkey monkey1 =new Monkey();
		System.out.print("おさるの名前を決めてください>");
		monkey1.name =new Scanner(System.in).next();
		System.out.print("おさるの歳を決めてください>");
		int age =new Scanner(System.in).nextInt();
		monkey1.age=age;
		int select = 0;
		do{
			System.out.println("おさるに何をさせますか？1…挨拶、2…竹馬、3…逆立ち、4…終了>");
			select =new Scanner(System.in).nextInt();
			switch(select){
				case 1 :
					monkey1.greet();
					break;
				case 2 :
					monkey1.bamboo();
					break;
				case 3 :
					monkey1.reverse();
					break;
			}
		}while(select!=4);
		System.out.println("アプリケーションを終了します。");
	}
}
