import java.util.*;
public class ColorPencilApp{
	public static void main(String[] args){
		System.out.println("total:"+ColorPencil.getTotalDraw());
		ColorPencil cp1 =new ColorPencil("赤");
		ColorPencil cp2 =new ColorPencil("青",8);

		for(int i=0;i<6;i++){
			cp1.draw();
		}
		cp2.draw();
		System.out.println("total:"+ColorPencil.totalDraw);
	}
}
