import java.util.*;
public class TankApp{
	public static void main(String[] args){
		Tank tank1 =new Tank();
<<<<<<< HEAD
		do{
			System.out.print("タンク操作を入力 U(p),D(own),R(ight),L(eft),S(how),Q(uit)>");
			String str =new Scanner(System.in).next();
			char s =str.charAt(0);
			if(s =='U' ||s=='u'){
				tank1.moveUp();
			}else if(s =='D' || s=='d'){
				tank1.moveDown();
			}else if(s =='R' || s=='r'){
				tank1.moveRight();
			}else if(s =='L' || s=='l' ){
				tank1.moveLeft();
			}else if(s =='S' || s=='s'){
				tank1.showPos();
			}
		}while(true);
		System.out.println("終了");
=======
		while(true){
			System.out.print("タンク操作を入力 U(p),D(own),R(ight),L(eft),S(how),Q(uit)>");
			String select =new Scanner(System.in).next();
			String str=select.toUpperCase();
			char s =str.charAt(0);
			if(s =='U'){
				tank1.moveUp();
			}else if(s =='D'){
				tank1.moveDown();
			}else if(s =='R'){
				tank1.moveRight();
			}else if(s =='L'){
				tank1.moveLeft();
			}else if(s =='S'){
				tank1.showPos();
			}else if(s =='Q'){
				System.out.println("終了");
				return;
			}
		}
>>>>>>> 2296870eebd670cd48db4d0c42dc1cd5b6346557
	}
}
