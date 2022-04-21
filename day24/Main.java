public class Main{
	public static void main(String[] args){
		/*
		Hero h =new Hero();
		h.run();
		SuperHero sh =new SuperHero();
		sh.run();
		Matango m=new Matango();
		m.hp=10;
		h.attack(m);
		sh.flying = true;
		sh.attack(m);
		System.out.println(m.hp);
		*/
		//SuperHero sh=new SuperHero();
		//Weapon w=new Weapon();
		
		Hero h = new Hero();
		PoisonMatango pm=new PoisonMatango('A');
		pm.attack(h);
		
	}
}
