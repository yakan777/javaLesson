import java.util.*;
public class Dice{
	public static void main(String[] args){
		int[] dice =new int [10];
		for(int i = 0;i<dice.length;i++){
			dice[i] = new Random().nextInt(6)+1;
			System.out.println(Arrays.toString(dice));
		}
	}
}
