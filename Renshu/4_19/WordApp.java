import java.util.*;
public class WordApp{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		Word[] data={
			new Word("ぞう","elephant"),
			new Word("しろくま","polarbear"),
			new Word("くじら","whale"),
			new Word("ペンギン","penguin"),
			new Word("カンガルー","kangaroo"),
			new Word("ライオン","lion"),
			new Word("ひと","human"),
			new Word("いぬ","dog"),
			new Word("ねこ","cat"),
			new Word("あり","ant"),
		};
		for(int i =0;i<data.length;i++){
			System.out.print(data[i].ja+">");
			String ans =sc.next();
			if(data[i].check(ans)){
				System.out.println("正解");
			}else{
				System.out.println("不正解！"+data[i].ja+"の英単語は"+data[i].en);
			}
		}
		System.out.printf("全%d問中%d問正解%n",Word.total,Word.correct);
	}
}
