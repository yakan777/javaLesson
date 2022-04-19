import java.util.*;
public class ColorPencil2App{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("何本>");
		int n =sc.nextInt();sc.nextLine();
		ColorPencil2[] data =new Colorpencil2[n];
		for(int i =0;i<data.length;i++){
			System.out.print("色>");
			String color =sc.next();
			System.out.print("長さ>");
			int length =sc.nextInt();
			data[i]=new ColorPencil(color,length);
			data[i].showStatus();
		}
		/*while(true){
			for()
			int select=sc.nextInt();
			if(select==)

				cp1.draw();
		cp2.draw();
		System.out.println("total:"+ColorPencil.totalDraw);
		}*/
	}
}
