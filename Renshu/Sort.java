import java.util.*;
public class Sort{
	public static void main(String[] args){
		final int GAME_COUNT=5;
		int[] balls=new int[100];
		for(int i =0;i<balls.length;i++){
			balls[i]=i+1;
		}
		
		for(int i =0;i<balls.length-1;i++){
			int idx=new Random().nextInt(balls.length-i)+i;
			int temp=balls[idx];
			balls[idx]=balls[i];
			balls[i]=temp;
		}
		int aWin=0,bWin=0;
		for(int i = 0;i<GAME_COUNT;i++){
			System.out.printf("%d回線%n",i+1);
			int ballA=balls[i];
			int ballB= balls[balls.length -1 -i];
			String winner;
			if(ballA>ballB){
				winner="A";
				aWin++;
			}else{
				winner="B";
				bWin++;
			}
			System.out.printf("A:%d,B:%d...%sの勝ち%n",ballA,ballB,winner);

		}
		System.out.printf("%d対%dで%sの勝ち%n",aWin,bWin,aWin>bWin?"A":"B");
	}
}
