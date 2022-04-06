import java.util.*;
public class RefType{
	public static void main(String[] args){
		int a=10;
		int b=a;
		b++;
		System.out.println(a);
		System.out.println(b);

		int[] arrA= new int[]{3,5}
		int[] arrB= arrA;
		arrB[0]=100;
		System.out.println(arrayA[0]);
		System.out.println(arrayB[0]);

		int x=0;

		int[] arrC= null;
		System.out.println(arrC);

		int[] arrD = {1,2,3};
		arrD=new int[]{3,5,7};
		arrD=null;

		int[]arrE = {2,3,4};
		int[]arrF = arrE;
		arrE = null;
		System.out.println(arrF[0]);

	}
}
