import java.util.*;
public class Kanma{
	public static void main(String[] args){
		System.out.print("整数をカンマ区切りで入力>");
		String num =new Scanner(System.in).nextLine();
		int sum =0;
		String[] data=num.split(",");
		for(int i =0;i<data.length;i++){
			int n = Integer.parseInt(data[i]);
			sum += n;
		}
		System.out.println("合計は"+ sum +"です");
	}
}
