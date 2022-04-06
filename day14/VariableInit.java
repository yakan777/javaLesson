import java.util.*;
public class VariableInit{
	public static void main(String[] args){
		/*ng
		 int n;
		System.out.println(n);
		*/
		/* ng
		 * javaは条件式にはいている変数を調査しない
		int n;
		int x=5;
		if(x>0){
			n=10;
		}
		System.out.println(n);
		*/
		/* OK
		int n;
		if(5>0){
			n=10;
		}
		System.out.println(n);
		*/
		/* OK
		 * if ~else文はどちらか一方を通ることが保障されている文なので
		int n;
		int x=5;
		if(X>0){
			n=10;
		}else{
			n=20;
		}
		System.out.println(n);
		*/
		/*
		int n;
		int X=5;
		if(X > 0){
			n=10;
		}else if(x <=0){
			n=20;
		}
		System.out.println(n);
		*/
		/*
		int n;
		int X=5;
		if(X>0){
			n=10;
		}else if(X<0){
			n=20;

		}else{
			n=30
		}
		System.out.println(n);
		*/
		/*
		 int n =new Random().nextInt(3);
		switch(n){
case:0
		 fortune="大吉";
		 break;
case:1
		 fortune="中吉";
		 break;
case:2
		 fortune="吉";
		 break;
		 */
		/*ok
		 int n =new Random().nextInt(3);
		switch(n){
case 0:
		 fortune="大吉";
		 break;
case 1:
		 fortune="中吉";
		 break;
case 2:
     default;
		 fortune="吉";
		 break;
		 */
		/*ok
		int n;
		if(true){
			n=10;
		}
		System.out.println(n);
		*/
		/*ng
		int n;
		boolean isOk=true;
		if(isOk){
			n=10;
		}
		System.out.println(n);
		*/
		/*ok
		 * do~whileは最低一回は通ることが保障されている
		int n;
		do{
			n=10;
		}while(false);
		System.out.println(n);
		*/
		/*ok
		 int n;
		for(;;){
			n=3;
			break;
		}
		System.out.println(n);
		*/
		/*ng
		 * 継続条件に変数が入っている
		int n;
		for(int i =0;i<10;i++){
			n=3;
		}
		System.out.println(n);
		*/
		
	}
}
