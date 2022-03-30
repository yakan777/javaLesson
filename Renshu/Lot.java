import java.util.*;
public class Lot{
	public static void main(String[] args) {
		int[] lot =new int[101];
		for(int i =0;i<lot.length;i++){
			lot[i]=i;
		}
		for(int i=0;i<lot.length-1;i++){
			int index = new Random().nextInt(lot.length-i)+i;
			int temp=lot[index];
			lot[index]=lot[i];
			lot[i]=temp;
		}
		System.out.print("何枚>>");
		int n =new Scanner(System.in).nextInt();
		int[] my =new int[n];
		for(int i =0;i<my.length;i++){
			my[i] = lot[i];
		}
		System.out.println(Arrays.toString(my));
		int r = new Random().nextInt(lot.length);
		System.out.println("当選番号:"+ r);
		boolean isLose = true;
		for(int a:my){
			if(r == a){
				isLose=false;
			}
		}
		if(isLose){
			System.out.println("はずれ");
		}else{
			System.out.println("アタリ");
		}

		}
}
