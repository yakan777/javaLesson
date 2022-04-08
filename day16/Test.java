import java.util.*;
public class Test{
	public static void main (String[] args){
		int max = maxU(9,8);
		System.out.println(max);
	}
	public static int maxU(int a,int b){
		return a > b ? a:b;
	}
}
