import java.util.*;
public class Kuku{
	public static void main(String[] args){
		System.out.print("START>>");
		int s =new Scanner(System.in).nextInt();
		System.out.print("END>>");
		int e =new Scanner(System.in).nextInt();
		for(int i=s;i<=e;i++){
			for(int j=1;j<=9;j++){
				System.out.printf("%d*%d=%2d ",i,j,i*j);
			}
			System.out.println();
		}
	}
}
