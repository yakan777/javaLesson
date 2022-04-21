public class Main{
	public static void main(String[] args){
		//Character c = new Character();
		Dancer d=new Dancer("ゼシカ");
		Matango m=new Matango();
		d.dance();
		m.hp=10;
		d.attack(m);
		Monk mo=new Monk("弥助");
		mo.pray();
		mo.attack(m);
	}
}
