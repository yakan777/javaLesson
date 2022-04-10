import java.util.*;
public class MethodPract{
	public static void main (String[] args){
		System.out.print("Mサイズのピザを注文(1枚または２枚)>");
			int num =new Scanner(System.in).nextInt();
		int price = 1000;
		int price2 = 1500;
		double area = calcArea(10,10);
		double area2 = calcArea(15,15);
		if(num==2){
			System.out.println("Mサイズ１枚"+ price +"円"+ (int)area +"cm,Lサイズ1枚"+ price2 + "円" + (int)area2 +"cmなのでLサイズをおすすめします");
		}else{
			System.out.println("注文受け付けました");
		}
	}
		public static double calcArea(double a,double b){
			double area = a * b * Math.PI;
			return area;
		}
}
