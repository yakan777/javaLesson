import java.util.*;
public class Method1{
	public static void main(String[] args){
		int max = maxOf(3,8);
		System.out.println(max);
		double area = calcTriangleArea(3.0,2.8);
		System.out.println(area);
		boolean isSame= isSame(new int[]{3,3,3});
		if(isSame){
			System.out.println("要素はすべて等しいです");
		}else{
			System.out.println("要素がすべて等しいわけではありません");
		}
		int price = 2800;
		int tax =10;
		int taxIn =calcTaxIn(price,tax); 
		System.out.printf("定価%d円税率%d%%の税込価格は%d円です。",price,tax,taxIn);
		System.out.print("身長(cm)>>");
		double height=new Scanner(System.in).nextDouble();
		System.out.print("体重(kg)>>");
		double weight=new Scanner(System.in).nextDouble();
		double bmi = calcBMI(weight,height);
		System.out.printf("BMI:%.2f%n",bmi);
	}

	public static int maxOf(int a,int b){
		return a > b ? a:b;
	}
	public static double calcTriangleArea(double bottom,double height){
		double area = bottom * height /2;
		return  area;
	}
	public static boolean isSame(int[] arr){
		int first=arr[0];
		for(int i=1;i<arr.length;i++){
			if(first != arr[i]){
				return false;
			}
		}
		return true;
	}
	public static int calcTaxIn(int price,int tax){
		int taxin = (int)(price * (1+tax/100d));
		return taxin;
	}
	public static double calcBMI(double weightKg,double heightCm){
		double bmi = weightKg / (heightCm/100 * heightCm/100);
		return bmi;
	}
}
