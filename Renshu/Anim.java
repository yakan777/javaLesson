import java.util.*;
public class Anim{
	public static void main(String[] args){
		System.out.println("この箱の中の動物は天気によって種類が変わり性別はランダムです。今の天気を確認してください。1 = 晴れ:2 =:曇り３=雨:");
        int tenki = new Scanner(System.in).nextInt();
	int onof =(int)(Math.floor(Math.random()*2) +1);
	if(tenki ==1){
	  if(onof ==1){  
		System.out.println("晴れているので箱の中にはオスのキリンがいます");
          }else{ 
	        System.out.println("晴れているので箱の中にはメスのキリンがいます");       }
       }else if(tenki ==2){
	  if(onof ==1){
	        System.out.println("曇りなので箱の中にはオスの犬がいます");
          }else{ 
	        System.out.println("曇りなので箱の中にはメスの犬がいます");
          }
       }else if(tenki ==3){
	  if(onof == 1){
	        System.out.println("雨なので箱の中にはオスの猫がいます");
          }else{ 
	        System.out.println("雨りなので箱の中にはメスの猫がいます");
          }

       } 
   }
}
