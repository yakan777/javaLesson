import java.util.*;
public class Pract4_14{
	public static void main(String[] args){
		int sum=0;
		for(String s:args){
			sum += Integer.parseInt(s);
			for(int i =0;i<sum;i++){

				System.out.print("Hello ");
			}
		}
	}
}
