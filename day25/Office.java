import java.util.*;
public class Office{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("あなたの部下に3人配属されました");
		OfficeWorker[] data=new OfficeWorker[3];
		for(int i =0;i<3;i++){
			System.out.print(i+1 +"人目の名前を入力してください>");
			String name = sc.next();
			System.out.println("はじめまして私は"+name+"です");
			int rnd =new Random().nextInt(3);
			if(rnd==0){
				data[i]=new OrdinaryOfficeWorker(name);
			}
			if(rnd==1){
				data[i]=new EliteOfficeWorker(name);
			}
			if(rnd==2){
				data[i]=new LazyOfficeWorker(name);
			}
		}
		while(true){
			System.out.printf("誰の働きぶりを見に行きますか？%n0...%s%n1...%s%n2...%s%n3...終了%n番号を入力してください>",data[0].name,data[1].name,data[2].name);
			int select =sc.nextInt();
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
	OrdinaryOfficeWorker(String name){
		super(name);
	}
	@Override
	public void work(){
		System.out.printf("%sは９時から５時まで働いている。遅刻や欠勤はない%n",this.name);
	}
}
class EliteOfficeWorker extends OfficeWorker{ 
	EliteOfficeWorker(String name){
		super(name);
	}
	@Override
	public void work(){
		System.out.printf("%sは仕事がはやい！しかも正確だ。%n",this.name);
	}
}
class LazyOfficeWorker extends OfficeWorker{ 
	LazyOfficeWorker(String name){
		super(name);
	}
	@Override
	public void work(){
		System.out.printf("%sはPCの画面を即座に切り替えた。何をしていたのだろう。%n",this.name);
	}
}
