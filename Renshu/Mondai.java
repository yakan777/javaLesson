import java.util.*;
public class Mondai{
	public static void main(String[] args){
		System.out.print("行数>");
		char[] alpha ={'A','B','C','D','E'};
		int line =new Scanner(System.in).nextInt();
		int[][] data=new int[line][];
		for(int i =0;i<data.length;i++){
			System.out.print(i+1 + ":");
			int r =new Random().nextInt(10)+1;
			data[i]=new int[r];
			for(int j =0;j<data[i].length;j++){
				int r2 =new Random().nextInt(alpha.length);
				data[i][j]=alpha[r2];
				System.out.print(data[i][j]);
			}
			System.out.println();
		}
	}
}
