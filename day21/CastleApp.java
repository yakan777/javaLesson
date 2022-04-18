import java.util.*;
public class CastleApp{
	public static void main(String[] args){
		int rnd =new Random().nextInt(90)+10;
		Castle a1=new Castle('A',rnd);
		Castle a2=new Castle('B',rnd);
		Castle a3=new Castle('C',rnd);
		Castle a4=new Castle('D',rnd);
		Castle a5=new Castle('E',rnd);
		Castle a6=new Castle('F',rnd);
		Castle a7=new Castle('G',rnd);
		Castle a8=new Castle('H',rnd);
		Castle a9=new Castle('I',rnd);
		Castle a10=new Castle('J',rnd);

		Castle[] archers=new Castle[10];
		archers[0]=a1;
		archers[1]=a2;
		archers[2]=a3;
		archers[3]=a4;
		archers[4]=a5;
		archers[5]=a6;
		archers[6]=a7;
		archers[7]=a8;
		archers[8]=a9;
		archers[9]=a10;

		for(Castle a:archers){
			a.atacck();
		}
	}
}
