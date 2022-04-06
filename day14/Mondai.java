import java.util.*;
public class Mondai{
	public static void main(String[] args){
		System.out.print("給水所にやってきた人数>");
		int num =new Scanner(System.in).nextInt();
		for(int i = 0;i<num;i++){
			System.out.print(i+1 +"人目の人は喉が乾いてる（たぶん:0違う:1）>");
			int face =new Scanner(System.in).nextInt();
			if(face==0){
				System.out.println(i+1+"人目の人水をどうぞ");
			}else{
				System.out.println("さようなら");
			}
		}
	}
}
