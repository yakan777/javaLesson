import java.util.*;
public class ListLesson{
	public static void main(String[] args){
		ArrayList<String> names=new ArrayList<>();
		names.add("John");
		names.add("Paul");
		names.add("George");
		names.add("Ringo");

		System.out.println(names.size());//4
		System.out.println(names.get(0));//John
		names.remove(0);
		System.out.println(names.size());//3
		System.out.println(names);//一覧

		ArrayList<Integer> nums=new ArrayList<>();
		nums.add(10);
		nums.add(20);
		nums.add(30);
		nums.add(40);

		for(int i =0;i<nums.size();i++){
			System.out.println(nums.get(i));
		}
		/////↓intでも良い
		for(Integer n:nums){
			System.out.println(n);
		}
		nums.add(0,100);
		System.out.println(nums);
		nums.set(0,1000);
		System.out.println(nums);
		if(nums.isEmpty()){
		}
		if(nums.contains(1000)){
			System.out.println("含みます");
		}
		System.out.println(nums.indexOf(10));
		nums.remove(0);

		names.remove("Ringo");

		nums.clear();
	}
}
