import java.util.*;
public class ScoresMain{
	public static void main(String[] args){
		System.out.print("クラスの数>");
		int classNum =new Scanner(System.in).nextInt();
		int[][] data =new int[classNum][];
		for(int i =0;i<data.length;i++){
			System.out.printf("%d組のクラスの人数",i+1);
			int studentNum=new Scanner(System.in).nextInt();
			data[i]=new int[studentNum];
			for(int j =0;j<data[i].length;j++){
				System.out.printf("%d組%d人目の点数>",i+1,j+1);
				data[i][j]=new Scanner(System.in).nextInt();
			}
		}
		System.out.println("--表出力--");
		for(int i =0;i<data.length;i++){
			System.out.printf("%d組 ",i+1);
			for(int j=0;j<data[i].length;j++){
				System.out.printf("%d ",data[i][j]);
			}
			System.out.println();
		}
	}
}
