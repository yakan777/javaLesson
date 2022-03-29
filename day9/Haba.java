import java.util.*;
public class Haba{
	public static void main(String[] args){
		System.out.print("幅(2~9)>>");
		int w =new Scanner(System.in).nextInt();
		boolean isWin=false;
		for(int i=0;i<3;i++){
				boolean isLine = true;
				int first=0;
			for(int j=0;j<w;j++){
				int r =new Random().nextInt(9)+1;
				if(j==0){
					first=r;
				}else{
					if(first !=r){
						isLine=false;
					}
				}
				System.out.print(r);
				
			}
			if(isLine){
				isWin=true;
			}
			System.out.println();
		}
		
			System.out.println(isWin? "あたり":"はずれ");
	}
}
