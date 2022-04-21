public class MonsterApp{
	public static void main(String[] args){
		Goblin g =new Goblin(50,20);
		Werewolf ww =new Werewolf(120,30);
		DeathBat db =new DeathBat(30,20);
		g.attack();
		ww.attack();
		db.attack();
		g.run();
		ww.run();
		db.run();
	}
}
abstract class Monster{
	int hp;
	int mp;
	Monster(int hp,int mp){
		this.hp=hp;
		this.mp=mp;
	}
	public abstract void attack();
	public abstract void run();
}
abstract class WalkingMonster extends Monster{
	WalkingMonster(int hp,int mp){
		super(hp,mp);
	}
	@Override
	public void run(){
		System.out.println("トコトコ走って逃げる");
	}

}
abstract class FlyingMonster extends Monster{
	FlyingMonster(int hp,int mp){
		super(hp,mp);
	}
	@Override
	public void run(){
		System.out.println("バサバサ飛んで逃げる");
	}
}
class Goblin extends WalkingMonster{
	Goblin(int hp,int mp){
		super(hp,mp);
	}
	@Override
	public void attack(){
		System.out.println("ナイフで斬りつける");
	}
}
class Werewolf extends WalkingMonster{
	Werewolf(int hp,int mp){
		super(hp,mp);
	}
	@Override
	public void attack(){
		System.out.println("かみつく");
	}
}
class DeathBat extends FlyingMonster{
	DeathBat(int hp,int mp){
		super(hp,mp);
	}
	@Override
	public void attack(){
		System.out.println("突っつく");
	}

}
