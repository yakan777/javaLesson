import java.util.*;
public class Rect{
	public static void main(String[] args){
		System.out.print("縦>");
		double height =new Scanner(System.in).nextDouble();
		System.out.print("横>");
		double width =new Scanner(System.in).nextDouble();
		double rect =calcRect(height,width);
		System.out.printf("長方形の面積は%.1fです%n",rect);

	}
	public static double calcRect(double height,double width){
		double rect = height * width;
		return rect;
	}
}
