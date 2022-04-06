import java.util.*;
public class Score{
	public static void main(String[] args){
		//1.人数を聞く
		System.out.print("何人>");
		int n = new Scanner(System.in).nextInt();
		//2.int型配列を人数分初期化する
		int[] scores = new int[n];
		//3.for文を使ってランダムな点数を配列に格納
		for(int i =0;i<scores.length;i++){
			scores[i]=new Random().nextInt(101);
		}
		//4.降順ソートする
		for(int i =0;i<scores.length-1;i++){
			for(int j=i+1;j<scores.length;j++){
				if(scores[i]<scores[j]){
					int temp=scores[i];
					scores[i]=scores[j];
					scores[j]=temp;
				}
			}
		}
		//5.出力する
		System.out.println(Arrays.toString(scores));

	}
}
