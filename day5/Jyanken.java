import java.util.*;
public class Jyanken{
	public static void main(String[] args){
		/*
		 *手を入力(グー:0,チョキ:1,パー;2)>>1
		 あなたはチョキ、PCはパー
		 あなたの勝ちです。(負け、あいこ）
		 *
		 */
    System.out.println("手を入力(グー:0,チョキ:1,パー;2)");
		int jyanken = new Scanner(System.in).nextInt();
		int pc = new Random().nextInt(3);
		if(jyanken ==0){
			if(pc ==0){
				System.out.println("あいこです");
			}else if(pc ==1){
				System.out.println("あなたの勝ちです");
			}else{
				System.out.println("あなたの負けです");
			}
		}else if(jyanken ==1){
			if(pc ==0){
				System.out.println("あなたの負けです");
			}else if(pc ==1){
				System.out.println("あいこです");
			}else{
				System.out.println("あなたの勝ちです");
			}
		}else{
			if(pc ==0){
				System.out.println("あなたの勝ちです");
			}else if(pc ==1){
				System.out.println("あなたの負けです");
			}else{
				System.out.println("あいこです");
			}
		}
	}
}
