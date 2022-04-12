public class MethodLesson10{
	public static void main(String[] args){
		int n =10;
		//値渡し
		method1(n);
		System.out.println(n);
	}
	static void method1(int n){
		n++;
		System.out.println(n);
	}
}
