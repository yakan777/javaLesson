import java.util.*;
public class BaseBall{
	public static void main(String[] args){
		int sumA =0;
		int sumB =0;
		for(int i =1;i<=3;i++){
			System.out.print(i+"回表Aの得点>");
			sumA += new Scanner(System.in).nextInt();
			System.out.print(i+"回裏Bの得点>");
			sumB += new Scanner(System.in).nextInt();
		}
		System.out.printf("Aチーム%d点、Bチーム%d点%n",sumA,sumB);
		if(sumA==sumB){
			System.out.println("引き分け");
		}else{
			System.out.printf("%sチームの勝ち",sumA > sumB ? "A":"B");
		}
	}
}
