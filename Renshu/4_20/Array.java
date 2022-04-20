import java.util.*;
public class Array{
	public static void main(String[] args){
		ArrayList<String> names=new ArrayList<>();

		names.add("John");
		names.add("Paul");
		names.add("George");
		names.add("Masao");

		System.out.println(names.size());
		System.out.println(names.get(0));
		names.remove(0);
		System.out.println(names.size());
		System.out.println(names);

		ArrayList<Integer> nums=new ArrayList<>();
		nums.add(10);
		nums.add(20);
		nums.add(30);
		nums.add(40);

		for(int i =0;i<nums.size();i++){
			for(int j =i+1;j<nums.size();j++){
				if(nums.get(i)<nums.get(j)){
					int temp=nums.get(i);
					nums.set(i,nums.get(j));
					nums.set(j,temp);
				}
			}
			System.out.println(nums.get(i));
		}
		//for(Integer n:nums){
		//	System.out.println(n);
		//}
		nums.add(0,100);
		System.out.println(nums);
		nums.add(0,1000);
		System.out.println(nums);	
		if(nums.isEmpty()){
		}
		if(nums.contains(1000)){
			System.out.println("含みます");
		}
		System.out.println(nums.indexOf(10));
		nums.remove(0);

		names.remove("Paul");

		nums.clear();
	}
}
