public class ColorPencil{
	//static field(静的変数 or クラス変数)
	static int totalDraw=0;
	String color;
	int length;
	ColorPencil(String color){
		this(color,5);
	}
	ColorPencil(String color,int length){
		//↓this()は一行目にしか書けない。複数書く場合は,を付けて追加
		//(color,length)
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
	static int getTotalDraw(){
		//System.out.println(this.name);
		//showStatus()←↑staticなのでこれらはエラー

		return totalDraw;
	}
}
