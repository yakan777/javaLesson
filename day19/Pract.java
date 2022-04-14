import java.util.*;
public class Pract{
	public static void main(String[] args){
		System.out.print("名前を入力>");
		String name =new Scanner(System.in).next();
		result(name);
	}
	static void result(String name){
		int	i = new Random().nextInt(3)+1;
		if(i ==0){
			System.out.println(name+"さんおはよう");
		}else if(i ==1){
			System.out.println(name+"さんこんにちは");
		}else{
			System.out.println(name+"さんこんばんは");
		}
	}
}
