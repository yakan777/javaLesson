public class Castle{
	public char name;
	public int power;
	public int hp=500;

	public Castle(char name,int power){
		this.name=name;
		this.power=power;
		this.hp=hp;
	}
	public void atacck(){
		System.out.printf("アーチャー%sの攻撃(%d):城の耐久(%d)%n",this.name,this.power,this.hp-this.power);
	}
}
