import java.util.*;
public class YearMonth{
	public static void main(String[] args){
		System.out.print("年月をカンマ区切りで入力>");
		String yearM = new Scanner(System.in).next();
	  String[] data=yearM.split(",");
		//int n = Integer.parseInt(yearM);
		System.out.println(Arrays.toString(data));
		//System.out.println();

	}

}
