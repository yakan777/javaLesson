import java.util.*;
public class Pract4_13{
	public static void main(String[] args){
		hello();
	}
	static  void hello(){
		int n = (int)(3*Math.random());{
			if(n==0){
				System.out.println("おはよう");
			}else if(n==1){
				System.out.println("こんにちは");
			}else{
				System.out.println("こんばんは");

			}
		}
	}
}
