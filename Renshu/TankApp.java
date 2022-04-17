import java.util.*;
public class TankApp{
	public static void main(String[] args){
		Tank tank1 =new Tank();
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
	}
}
