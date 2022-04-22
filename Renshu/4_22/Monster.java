public class Monster{
	public static void main(String[] args){
		Goblin g =new Goblin(50,20);
		g.run();
		g.attack();
	}
}
interface Creater{
	void run();
}
abstract class Monsters implements Creater{
	int hp;
	int mp;
	Monsters(int hp,int mp){
		this.hp=hp;
		this.mp=mp;
	}
	public abstract void attack();
}
abstract class WalkMonster extends Monsters{
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
		System.out.println("切りつけた");
	}

}
