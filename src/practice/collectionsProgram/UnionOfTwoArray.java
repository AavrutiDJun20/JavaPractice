package practice.collectionsProgram;

import java.util.Arrays;
import java.util.ArrayList;

public class UnionOfTwoArray {

	void findUnionOfArray(ArrayList<String> nameList1, ArrayList<String> nameList2) {
		ArrayList<String> list1 = new ArrayList<String>(nameList1);		
		list1.addAll(nameList2);		

		for(int index=0;index<list1.size();) {
			String name = list1.get(index);
			if(list1.indexOf(name) != list1.lastIndexOf(name)) {				
				list1.remove(list1.lastIndexOf(name));
			}			
			else {
				index++;
			}
		}
		System.out.println(list1);
	}

	public static void main(String[] args) {
		UnionOfTwoArray unionOfArrayUsingList = new UnionOfTwoArray();
		String[] name1 = { "Palak", "Viresh", "Yash", "Aavruti","Palak","Yash", "Yash" }; 
		String[] name2 = { "Deavina","Palak", "Nikhil", "Palak", "Viresh", "Nikhil", "Nikhil","Yash" };	
		ArrayList<String> nameList1 = new ArrayList<String>(Arrays.asList(name1));
		ArrayList<String> nameList2 = new ArrayList<String>(Arrays.asList(name2));	

		unionOfArrayUsingList.findUnionOfArray(nameList1,nameList2);	
	}
}
