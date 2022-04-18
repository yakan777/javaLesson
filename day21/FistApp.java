import java.util.*;
public class FistApp{
	public static void main(String[] args){
		int rock =300;
		char[] data={'a','b','c','d','e'};
		for(int i =0;i<data.length;i++){
		int rnd =new Random().nextInt(100);
		Fist a=new Fist(data[i],rnd);
		rock -=a.attack();
			System.out.printf(":岩(%d)%n",rock);
		}
		if(rock<=0){
			System.out.println("岩を破壊した");
		}else{
			System.out.println("岩は破壊できなかった");
		}
	}
}
