import java.util.*;
public class Hoi{
	public static void main(String[] args){
		System.out.print("あっち向いてホイ（下:0左:1右:2上:3)>>");
		int count = 0;
		int user = 0;
		int pc = 0 ;
		while(true){
			user =new Scanner(System.in).nextInt();
			pc =new Random().nextInt(4);
			count++;
			if(user!=pc){
				System.out.println("セーフ" + count +"ポイント");
				System.out.print("あっち向いてホイ（下:0左:1右:2上:3)>>");
			}else if(user==pc){
				System.out.println("アウト");
					System.out.println(count + "ポイントでした");
			break;
			}
		}
	}
}


