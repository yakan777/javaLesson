public abstract class Monster{
	int hp;
	int mp;
		Monster(int hp,int mp){
			this.hp=hp;
			this.mp=mp;
		}
	public abstract void run();
	public abstract void attack();
}
abstract class WalkMonster extends Monster{
	WalkMonster(int hp,int mp){
		super(hp,mp);
	}
	@Override
	public void run(){
		System.out.println("トコトコ逃げ出した");
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
