import java.util.*;
public class ArcherApp{
	public static void main(String[] args){
		int castle = 500;
		char[] data ={'A','B','C','D','E','F','G','H','I','J'};
		for(int i = 0;i<data.length;i++ ){
			int rnd =new Random().nextInt(90)+10;
			Archer a=new Archer(data[i],rnd);
			castle -= a.attack();
			System.out.printf(":城の耐久(%d)%n",castle);
		}
		if(castle<=0){
			System.out.println("城の攻略に成功した！");
		}else{
			System.out.println("城の攻略に失敗した！");
		}
	}
}
