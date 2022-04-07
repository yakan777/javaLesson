import java.util.*;
public class Method{
	public static void main(String[] args){
		int[][] data =new int[3][3];
		int count = 0;
		for(int i =0;i<data.length;i++){
			for(int j =0;j<data[i].length;j++){
				data[i][j]=new Random().nextInt(3)+1;
				System.out.print(data[i][j]);
			}
			if(isSame(data[i])){
				count++;
			}
			System.out.println();
		}
		if(count== 0){
			System.out.println("Lose");
		}else{
			System.out.println(count +"line win");

		}

	}
	public static boolean isSame(int[] arr){
		int line=arr[0];
		for(int i =0;i<arr.length;i++){
			if(line != arr[i]){
				return false;
			}
		}
		return true;

	}
	

}
