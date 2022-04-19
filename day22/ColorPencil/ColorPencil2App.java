import java.util.*;
public class ColorPencil2App{
	public static void main(String[] args){

		/*ColorPencil2[] arr{
			new ColorPencil2("赤",3),
			new ColorPencil2("青",5),
		}*/


		Scanner sc=new Scanner(System.in);
		System.out.print("何本>");
		int n =sc.nextInt();sc.nextLine();
		ColorPencil2[] data=new ColorPencil2[n];
		for(int i =0;i<data.length;i++){
			System.out.print("色>");
			String color =sc.next();
			System.out.print("長さ>");
			int length =sc.nextInt();
			data[i]=new ColorPencil2(color,length);
		}
		System.out.println();
		while(true){
			for(int i =0;i<data.length;i++){
				System.out.printf("%d.%s%n",i,data[i].color);
			}
			System.out.printf("%d描いた長さのtotalを見る%n",data.length);
			System.out.printf("%d終了%n",data.length+1);
			System.out.print("何で描く>");
			int select=sc.nextInt();
			if(select==data.length+1){
				break;
			}
			if(select==data.length){
				System.out.println("描いた長さのトータルは"+ColorPencil2.getTotalDraw());
				System.out.println();
			}
			if(select<data.length){
				data[select].draw();
				System.out.println();
			}
		}
	}
}
