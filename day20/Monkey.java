public class Monkey{
	String name;
	int age;

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
