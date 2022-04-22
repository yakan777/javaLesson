import java.util.*;
public class Office{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		Random rnd=new Random();
		OfficeWorker[] data=new OfficeWorker[3];
		System.out.println("あなたの部下に3人配属されました");
		for(int i =0;i<data.length;i++){
			System.out.print(i+1+"人目の名前を入力してください>");
			String name=sc.next();
			int r =rnd.nextInt(3);
			if(r==0){
				data[i]=new OrdinaryOfficeWorker(name);
			}
			if(r==1){
				data[i]=new EliteOfficeWorker(name);
			}
			if(r==2){
				data[i]=new LasyOfficeWorker(name);
			}
			data[i].introduce();
		}
		while(true){
			System.out.printf("誰の働きぶりを見にいきますか?%n0・・・%s%n1・・・%s%n2・・・%s%n3・・・終了%n番号を入力してください>",data[0].name,data[1].name,data[2].name);
			int select=sc.nextInt();
			if(select==3){
				return;
			}
			data[select].work();
		}
	}

}
abstract class OfficeWorker{
	String name;
	OfficeWorker(String name){
		this.name=name;
	}
	public void introduce(){
		System.out.printf("はじめまして私は%sです%n",this.name);
	}
	public abstract void work();
}
class OrdinaryOfficeWorker extends OfficeWorker{
	OrdinaryOfficeWorker (String name){
		super(name);
	}
	@Override
	public void work(){
		System.out.printf("%sは９時から５時まで働いている。遅刻や欠勤はない%n",this.name);
	}
}

class EliteOfficeWorker extends OfficeWorker{
	EliteOfficeWorker (String name){
		super(name);
	}
	@Override
	public void work(){
		System.out.printf("%sは仕事がはやい！しかも正確だ。%n",this.name);
	}
}

class LasyOfficeWorker extends OfficeWorker{
	LasyOfficeWorker (String name){
		super(name);
	}
	@Override
	public void work(){
		System.out.printf("%sはPCの画面を即座に切り替えた。何をしていたのだろう。%n",this.name);
	}
}
