import java.util.*;
public class Swap{
	public static void main(String[] args){
		int a=10;
		int b=20;
		/*
		 * 2値の交換アルゴリズム
		 */
		int temp = a;
		a=b;
		b=temp;

		//"a:20,b:10"
		System.out.println("a:"+a+",b:"+b);
		
		int[] data=[3,1,5,2,4];
		for(int i = 0;i<data.length/2;i++){
			int temp=data[i];
			data[i]=data[data.length-1 -i];
			data[data.length-1-i]=temp;

		}

		//処理
		System.out.println(Arrays.toStrigng(data)); //[4,2,5,1,3]
	}
}
