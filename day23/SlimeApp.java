import java.util.*;
public class SlimeApp{
	public static void main(String[] args){
		Scanner sc =new Scanner(System.in);
			ArrayList<Slime> slimes=new ArrayList<>();
		while(true){
			System.out.print("スライムを追加する？(1…yes,2…no)>");
			int input =sc.nextInt();
			if(input == 2) break;
			System.out.print("追加するスライムの名前を決めてね>");
			String name =sc.next();
			Slime slime =new Slime(name);
			slimes.add(slime);
		}
		for(Slime s:slimes){
			s.attack();
		}
	}
}
class Slime{
	String name;
	Slime(String name){
		this.name=name;
		System.out.println(this.name+"が現れた！");
	}
	void attack(){
		System.out.printf("%sの攻撃:5ポイントのダメージを与えた%n",this.name);
	}
}
