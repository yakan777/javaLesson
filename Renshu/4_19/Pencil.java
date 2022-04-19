public class Pencil{
	//static field(静的変数 or クラス変数)
	static int totalDraw=0;
	String color;
	int length;
	Pencil(String color,int length){
		this.color=color;
		this.length=length;
		this.showStatus();
	}
	void showStatus(){
		System.out.print(this.color+":");
		for(int i =0;i<this.length;i++){
			System.out.print("-");
		}
		System.out.println(">");
	}
	void draw(){
		if(this.length <=0){
			System.out.println("もう描けません");
			return;
		}
		System.out.printf("%sで描いた%n",this.color);
		this.length--;
		totalDraw++;
		this.showStatus();
	}
}
