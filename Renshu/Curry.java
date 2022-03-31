import java.util.*;
public class Curry{
	public static void main(String[] args){
		String[] curry = {"ポーク","ビーフ","チキン"};
		final String[] TOPPINGS ={
			"大根",
			"セロリ",
			"里芋",
			"カブ",
			"ゴーヤ",
			"キュウリ",
			"カツオのたたき",
			"ラム肉",
			"鯖の水煮",
			"ブリ",
			"タコ",
			"ちくわ",
			"魚肉ソーセージ",
			"こんにゃく",
			"ツナ缶",
			"納豆",
			"アボガド",
			"レーズン",
			"あげ玉",
		};
		//質問をしてカレーのベースを決める
		System.out.print("ベースとなるカレーを選択してください0:ポーク,1:ビーフ,2:チキン>");
		int base =new Scanner(System.in).nextInt();
		

		//トッピングが何種類かを聞く
		System.out.print("トッピングは何種類？>");
		int cate =new Scanner(System.in).nextInt();

		//トッピング配列をシャッフル
		for(int i=0;i<TOPPINGS.length-1;i++){
			int index = new Random().nextInt(TOPPINGS.length-i)+i;
			String temp=TOPPINGS[index];
			TOPPINGS[index]=TOPPINGS[i];
			TOPPINGS[i]=temp;
		}
		//トッピング数だけ、配列の頭から取り出しながら文字列連結
		String guzai ="";
		for(int i =0;i<cate;i++){
			guzai += TOPPINGS[i];

		}

		//結果を表示する
		System.out.printf("今夜のカレーは「%s%sカレー」に決まりました",guzai,curry[base]);
	}
}
