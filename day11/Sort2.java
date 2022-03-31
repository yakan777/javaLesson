import java.util.*;
public class Sort2{
	public static void main(String[] args){
		System.out.print("人数>");
		int n =new Scanner(System.in).nextInt();
		int[] score = new int[n];
		for(int i =0;i<score.length;i++){
			int r =new Random().nextInt(101);
			score[i] = r;
		}
		for(int i =0;i<score.length-1;i++){
			for(int j =i+1;j<score.length;j++){
				if(score[i]<score[j]){
					int temp=score[i];
					score[i]=score[j];
					score[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(score));
	}
}
