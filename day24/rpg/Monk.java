public class Monk extends Character{
	Monk(String name){
		super(name);
	}
	Monk(String name,int hp){
		super(name,hp);
	}
	public void pray(){
		System.out.println(this.name+"は目を閉じて祈った");
	}
	@Override
	public void attack(Matango m){
		System.out.println(this.name+"の攻撃!");
		System.out.println("地面が割れて敵に1000ポイントのダメージを与えた");
		m.hp -= 1000;
	}
}
