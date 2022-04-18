import java.util.*;
public class StudentApp{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("生徒は何人>");
		int num =sc.nextInt();
		Student[] data =new Student[num];
		for(int i =0;i<data.length;i++){
			System.out.print((i+1)+"人目の名前>");
			String name =sc.next();
			System.out.print((i+1)+"人目の点数>");
			int score =sc.nextInt();
			Student s =new Student(i+1,name,score);
			data[i]=s;
		}
		while(true){
			System.out.print("操作を入力:1...登録順に一覧,2...点数降順に一覧,3...終了>");
			int select =sc.nextInt();
			if(select==1){
				for(int i =0;i<data.length;i++){
					for(int j =i+1;j<data.length;j++){
						if(data[i].id>data[j].id){
							Student temp=data[i];
							data[i]=data[j];
							data[j]=temp;
						}
					}
					data[i].showInfo();
				}

			}else if(select==2){
				for(int i =0;i<data.length;i++){
					for(int j =i+1;j<data.length;j++){
						if(data[i].score<data[j].score){
							Student temp=data[i];
							data[i]=data[j];
							data[j]=temp;
						}
					}
					data[i].showInfo();
				}


			}else{
				System.out.println("プログラムを終了");
				return;
			}

		}

	}
}
