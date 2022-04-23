import java.util.*;
public class ArcherApp{
	public static void main(String[] args){
		int castle =500;
		char[] data={'A','B','C','D','E','F','G','H','I','J'};
		for(int i=0;i<data.length;i++){
			int power =new Random().nextInt(100);
			Archer a=new Archer(data[i],power);
			a.attack();
			castle-=power;
			System.out.printf(":城の耐久(%d)%n",castle);
		}
		if(castle<=0){
			System.out.println("城の破壊に成功した！");
		}else{
			System.out.println("城の破壊に失敗した:");

		}

	}
}
class Archer{
	char name;
	int power;
	Archer(char name,int power){
		this.name=name;
		this.power=power;
	}
	void attack(){
		System.out.printf("%sの攻撃(%d)",this.name,this.power);
		//return this.power;
	}
}
