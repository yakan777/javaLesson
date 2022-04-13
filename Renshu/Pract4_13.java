import java.util.*;
public class Pract4_13{
	static void arrRevers(int[] data){
		for(int i=0;i<data.length/2;i++){
			int tmp = data[i];
			data[i] = data[data.length-1-i];
			data[data.length-1-i] = tmp;
		}
		System.out.println(Arrays.toString(data));
	}
	public static void main(String[] args){
		int[] arr1= new int[]{1,2,3,4,5};
		arrRevers(arr1);
	}
}
