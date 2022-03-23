import java.util.*;
public class MarryApp{
	public static void main(String[] args){
		/*
		 *　女性16,男性18
		 *32歳で女性のあなたは結婚出来ます
		 *17歳で男性のあなたは結婚出来ません
		 */

		/*DRY(don't repeat yourself)の原則
		 */
	
	System.out.println("性別(男性,女性)>>");
	String gender=new Scanner(System.in).next();
	System.out.println("年齢>>");
	int age=new Scanner(System.in).nextInt();

	/*if(gender.equals("男性")){
		if(age >= 18)
			System.out.println(age + "歳で男性のあなたは結婚できます");
		else
			System.out.println(age + "歳で男性のあなたは結婚できません");
	}else{
		 if(age >= 16)
			System.out.println(age + "歳で女性のあなたは結婚できます");
	 else
			System.out.println(age + "歳で女性のあなたは結婚できません");
	}*/

	if((gender.contains("女") && age >=16) ||
	   (gender.contains("男") && age >=18)){
			System.out.println(age + "歳で" + gender + "のあなたは結婚できます");
			}else{
			System.out.println(age + "歳で" + gender + "のあなたは結婚できません");
			}

			
	}
}
