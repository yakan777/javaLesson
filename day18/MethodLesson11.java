import java.util.*;
public class MethodLesson11{
	static void arrReverse(int[] arr){
		for(int i=0;i<arr.length/2;i++){
			int tmp = arr[i];
			arr[i] = arr[arr.length-1-i];
			arr[arr.length-1-i] = tmp;
        }
		System.out.println(Arrays.toString(arr));
	}
	public static void main(String[] args){
		int[] arr=new int[]{1,2,3,4,5};
		arrReverse(arr);
	}
}
