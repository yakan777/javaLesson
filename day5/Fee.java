import java.util.*;
public class Fee{
	public static void main(String[] args){
		/*
		 * 男性 :2000 (65以上 :1500)
		 * 女性 :1800 (65以上 :1200)
		 */
		System.out.println("性別(男,女)>>");
		String gender = new Scanner(System.in).next();
			System.out.println("年齢>>");
		int age = new Scanner(System.in).nextInt();
			
			int fee;
			if(gender.equals("男")){
				if(age >= 65){
					fee=1500;
				}else{
					fee=2000;
				}
			}else{
					if(age >= 65){
						fee=1200;
			}else{
				fee=1800;
			}
			}
System.out.println("料金は" + fee + "円です");
	}
}
