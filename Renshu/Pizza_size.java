public class Pizza_size {
	public static void main(String[] args) {
		String name = "M";
		final double maru = 3.14;
		int hankei = 10;
		int price = 2000;
		System.out.println(name+"サイズのピザは"+price+"円です");
		System.out.println("半径" + hankei + "cmの" + name + "サイズピザの面積は"+ hankei * hankei * maru +"cmです" );
		name = "L";
		hankei = 15;
		System.out.println( name + "サイズになると半径は" + hankei + "cmになるので面積は"+ hankei * hankei * maru+"cmです" );
		System.out.println("値段は1.5倍なので"+"("+price * 1.5 +"円"+")"+name+"をオススメします!");
	}
	}
