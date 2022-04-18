public class Archer{
	char name;
	int power;
	public Archer(char name,int power){
		this.name=name;
		this.power=power;
	}
	public int attack(){
		System.out.printf("アーチャー%sの攻撃！(%d power)",this.name,this.power);
		return this.power;
	}
}
