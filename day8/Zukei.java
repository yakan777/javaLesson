import java.util.*;
public class Zukei{
	public static void main(String[] args){
		for(int i =0;i<8;i++){
			for(int j = 0;j<6;j++){
				System.out.print((i+j)%3!=0?"田":"水");
			}
		System.out.println();
		}
	}
}
