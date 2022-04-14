package divisorapp.main;
import java.util.*;
public class DivisorApp{
	public static void main(String[] args){
		if(args.length ==0){
			System.out.println("error:引数を入れて実行してください");
			return;
		}
		for(String s:args){
			System.out.printf("%s:%s%n",s,
					Arrays.toString(divisorapp.logics.DivisorAppLogic.createDivisorArr(Integer.parseInt(s))));
		}

	}
}
