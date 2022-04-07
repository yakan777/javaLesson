import java.util.*;
public class ArrR{
	public static void main(String[] args){
		int[][] nums =new int[3][3];
		int count = 0;
			for(int i =0;i<nums.length;i++){
				for(int j =0;j<nums[i].length;j++){
					nums[i][j]=new Random().nextInt(3)+1;
					System.out.print(nums[i][j]);
				}
				if(isSame(nums[i])){
					count++;
				}
				System.out.println();
			}
		if(count== 0){
			System.out.println("Lose");
		}else{
			System.out.println(count +"line win!");
		}
	}
	public static boolean isSame(int[] arr){
		int first=arr[0];
		for(int i =0;i<arr.length;i++){
			if(first != arr[i]){
				return false;
			}
		}
		return true;
	}
}
