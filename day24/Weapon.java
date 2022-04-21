public class Weapon extends Item{
	public Weapon(){
		super("ななしの剣");
	}
}
class Item{
	String name;
	int price;
	Item(){}
	Item(String name){
		this.name=name;
		this.price=0;
	}
	Item(String name,int price){
		this.name=name;
		this.price=price;
	}
}
