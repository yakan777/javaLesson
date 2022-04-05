import java.util.*;
public class Hai2{
	public static void main(String[] args){
		int[][] nums =new int[3][3];
		for(int i = 0;i<nums.length;i++){
			for(int j = 0;j<nums[i].length;j++){
				int r = new Random().nextInt(9)+1;
				nums[i][j]=r;
			}
			System.out.println(Arrays.toString(nums[i]));
		}
			//for(int i =0;i<data.length;i++)
			//System.out.println(Arrays.toString(nums[i]));
	}
}
