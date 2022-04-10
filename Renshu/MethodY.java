import java.util.*;
public class MethodY{
	public static void main(String[] args){
		System.out.print("西暦と月をカンマ区切りで入力>");
		String ym =new Scanner(System.in).next();
		int[] data = ymArr(ym);
		int day=day(data[0],data[1]);
		System.out.println(data[0]+"年"+data[1]+"月は"+ day +"日あります");

	}
	public static int[] ymArr(String ym){
		String[] data =ym.split(",");
		int[] n = new int[data.length];
		for(int i =0;i<data.length;i++){
			n[i] = Integer.parseInt(data[i]);
		}
		return n;
	}
	public static boolean isDay(int year){
		if(year % 400==0 || year % 4==0 && year %100!=0){
			return true;
		}else{
			return false;
		}
	}
	public static int day(int year,int month){
		int day = 0;
		switch(month){
			case 1 :
			case 3 :
			case 5 :
			case 7 :
			case 8 :
			case 10 :
			case 12 :
				day = 31;
				break;
			case 2 :
				boolean isDay = isDay(year);
				if(isDay==true){
					day = 29;
				}else{
					day = 28;
				}
				break;
			default:
				day = 30;
		}
		return day;
	}
}
