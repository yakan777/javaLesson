import java.util.*;
public class BookApp{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("本のページ数を入力して下さい >");
		int page =sc.nextInt();
		System.out.print("本の価格を入力して下さい >");
		int price =sc.nextInt();
		Book b =new Book(page,price);
		System.out.print("ノートのページ数を入力して下さい >");
		page =sc.nextInt();
		System.out.print("ノートの価格を入力して下さい >");
		price =sc.nextInt();
		Note n =new Note(page,price);
		while(true){
			System.out.print("1. 本の情報表示 / 2. ノートの情報表示 / 3. ノートに追加書込 / 4.   終了>");
			int select =sc.nextInt();
			if(select==1){
				b.showInfo();
			}else if(select==2){
				n.showInfo();
			}else if(select==3){
				System.out.print("書き込む内容を入力してください>");
				String word =sc.next();
				n.words(word);
			}else{
				return;
			}
		}
	}
}
