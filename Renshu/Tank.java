public class Tank{
	int x;
	int y;

	public void moveUp(){
		this.y++;
		System.out.println("上に移動");
	}
	public void moveDown(){
		this.y--;
		System.out.println("下に移動");
	}
	public void moveRight(){
		this.x++;
		System.out.println("右に移動");
	}
	public void moveLeft(){
		this.x--;
		System.out.println("左に移動");
	}
	public void showPos(){
		System.out.println("現在座標(x:"+this.x +",y:"+this.y+")" );
	}

}
