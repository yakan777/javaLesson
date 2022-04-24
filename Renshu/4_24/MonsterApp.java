public class MonsterApp{
	public static void main(String[] args){
		Goblin g =new Goblin(50,20);
		g.attack();
		g.run();
	}
}
interface Creater{
	void run();
}
abstract class Monster implements Creater{
	int hp;
	int mp;
	Monster(int hp,int mp){
		this.hp=hp;
		this.mp=mp;
	}
	abstract void attack();
}
abstract class WalkMonster extends Monster{
	WalkMonster(int hp,int mp){
		super(hp,mp);
	}
	@Override
	public void run(){
		System.out.println("走って逃げた");
	}
}
class Goblin extends WalkMonster{
	Goblin(int hp,int mp){
		super(hp,mp);
	}
	@Override
	public void attack(){

		System.out.println("ナイフで切り付けた");
	}
}
