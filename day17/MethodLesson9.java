import java.util.*;
public class MethodLesson9{
	static double calcBMI(double weightKg,double heightCm){
		return weightKg/(heightCm/100*heightCm/100);
	}
	public static void main(String[] args){
		System.out.print("体重を入力してください(kg)>");
		double weightKg =new Scanner(System.in).nextDouble();
		System.out.print("身長を入力してください(cm)>");
		double heightCm =new Scanner(System.in).nextDouble();
		//double calcBMI =  calcBMI(double weightKg,double heightCm); 
		System.out.printf("体重%.1f身長%.1fのBMIは%.1fです%n",weightKg,heightCm,calcBMI(weightKg,heightCm));
	}
}
