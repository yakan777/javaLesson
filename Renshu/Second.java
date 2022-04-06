import java.util.*;
public class Second{
	public static void main(String[] args){
		System.out.print("クラスの数>");
		int num =new Scanner(System.in).nextInt();
		int[][] data=new int[num][];
		for(int i =0;i<data.length;i++){
			System.out.print(i+1 +"組のクラスの人数>");
			int cNum=new Scanner(System.in).nextInt();
			data[i]= new int[cNum];
			for(int j =0;j<cNum;j++){
				System.out.print(i+1 + "組"+ (j+1) +"人目の点数>" );
				int score = new Scanner(System.in).nextInt();
				data[i][j]=score;

			}
		}
		System.out.println("--表出力--");
		for(int i =0;i<data.length;i++){
			System.out.print(i+1 + "組");
			for(int j =0;j<data[i].length;j++){
				System.out.print(data[i][j] + " ");
			}
			System.out.println();
		}
	}
}

