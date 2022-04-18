public class Monkey{
	/*フィールド変数*/
	String name;
	int age;
	/*コンストラクター(constructor)*/
	//public Monkey(){}
	public Monkey(String name){
		this.name=name;
	}
	public Monket(String name,int age){
		this.name=name;
		this.age=age;
	}
	/*メソッド*/
	//挨拶をするメソッド
	public void greet(){
		System.out.println("こんにちは"+this.name+"("+this.age+"才)です。よろしく！");
	}
	public void bamboo(){
		System.out.println(this.name +"は上手に竹馬にのった！");
	}
	public void reverse(){
		System.out.println(this.name +"はひょいと逆立ちをした！");
	}
}
