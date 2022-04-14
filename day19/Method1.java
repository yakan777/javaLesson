import java.util.*;
public class Method1{
	public static void main(String[] args){
		if(args.length == 0){
			System.out.println("コマンドライン引数はありません");
		}else{
			for(String s:args){
				System.out.println(s);
			}
		}
	}
}
