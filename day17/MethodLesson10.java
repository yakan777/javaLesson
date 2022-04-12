public class MethodLesson10{
	public static void main(String[] args){
		int n =10;
		//値渡し
		method1(n);
		System.out.println(n);

		int[] arr=new int[]{1,2,3};
		method2(arr);
		System.out.println(arr[0]);
	}
	static void method1(int n){
		n++;
		System.out.println(n);
	}
	//参照値渡し(メインメソッドにも変化が反映)
	static void method2(int[] arr){
		for(int i =0;i<arr.length;i++){
			arr[i]=arr[i]+1;
		}
	}
}
