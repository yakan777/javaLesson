import java.util.*;
public class PencilApp{
	public static void main(String[] args){
		Scanner sc =new Scanner(System.in);
		System.out.print("何本>");
		int n =sc.nextInt();sc.nextLine();
		Pencil[] data=new Pencil[n];
		for(int i=0;i<data.length;i++){
			System.out.print("色>");
			String color =sc.next();
			System.out.print("長さ>");
			int length =sc.nextInt();
			data[i] =new Pencil(color,length);
		}
		System.out.println();
		while(true){
			for(int i =0;i<data.length;i++){
				System.out.printf("%d.%s%n",i,data[i].color);
			}
			System.out.printf("%d.描いた長さのtotalを見る%n",data.length);
			System.out.printf("%d.終了%n",data.length+1);
			System.out.print("何で描く>");
			int select =sc.nextInt();

			if(select==data.length+1){
				break;
			}
			if(select==data.length){
				System.out.printf("描いた長さのtotalは%dです%n",Pencil.totalDraw);
				System.out.println();
			}
			if(select<data.length){
				data[select].draw();
				System.out.println();
			}
		}
	}
}
