import java.util.*;
public class MethodMars{
	public static void main(String[] args){
		System.out.println("火星まで何で行く？");
		System.out.println("0:徒歩(時速5km)1:自転車(時速16km)2:新幹線(時速320km)3:宇宙船(時速28800km)");
		int num = new Scanner(System.in).nextInt();
		long day = days(5l);
		long day2 = days(16l);
		long day3 = days(320l);
		long day4 = days(28800l);
		System.out.println("約"+ day4/365 + "年"+ (day4%365)/30 +"カ月"+ (day4%365)%30 + "日かかります");
	}
	public static long days(long a){
		long day = 55000000l/(a * 24);
		return day;
	}
}
