import java.util.*;
public class TestApp{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("何人の生徒にテストを渡す>");
		int num =sc.nextInt();
		Test[] data=new Test[num];
		for(int i=0;i<data.length;i++){
			data[i] =new Random().nextInt(101);
			data[i]=new Test(score);

		}
	}
}
