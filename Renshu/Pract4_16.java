import java.util.*;
public class Pract4_16{
	public static void main(String[] args){
		for(int i =1;i<=9;i++){
			for(int j =1;j<=9;j++){
				System.out.printf("%d×%d=%02d ",i,j,i*j);
			}
			System.out.println();
		}
		int[] data =new int[]{1,3,5,7,5,3,1};
		for(int i =0;i<data.length;i++){
			for(int j =0;j<data[i];j++){
			System.out.print("*");
			}
		System.out.println();
		}
	}
}
