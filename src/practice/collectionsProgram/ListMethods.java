package practice.collectionsProgram;
import java.util.*;
public class ListMethods {
	
	static List<String> input = new ArrayList<String>();
	
	static void addMethod() {
		input.add("Aavruti");
		input.add("Mayank");
		input.add("Divya");
		System.out.println("Add Method : \n" + input);
		input.add(0, "Harshit");
		input.add(4,"Pranjali");
		//input.add(7,"Aarti"); // error "IndexOutOfBoundsException"
		
		System.out.println("Add Index Method : \n" + input);
	}
	
	static void addAllMethod() {
		List<String> list2 = new ArrayList<String>();
		list2.addAll(input);
		System.out.println("Add All Method : \n" + list2);
		list2.addAll(3, input);
		System.out.println("Add All Index Method : \n" + list2);
	}
	
	static void clearMethod() {
		List<String> list3 = new ArrayList<String>();
		list3.addAll(input);
		list3.clear();
		System.out.println("Clear Method --> \n" + list3);
	}
	
	static void containsMethod() {
		System.out.println("Contains Method :");
		System.out.println("Contains Aavruti : " + input.contains("Aavruti"));
		System.out.println("Contains Aarti : " + input.contains("Aarti"));
		
		List<String> list3 = new ArrayList<String>();
		list3.add("Aarti");
		list3.addAll(0,input);
		System.out.println("Contains All Method : ");
		System.out.println("Main List --> " + input);
		System.out.println("List2     --> " + list3);
		System.out.println("Main List contains all value of List2 : " + input.containsAll(list3));
		System.out.println("List3 contains all value of Main List : " + list3.containsAll(input));
	}
	
	static void equalsMehtod() {
		List<String> list2 = new ArrayList<String>();
		list2.addAll(0,input);
		System.out.println("Equals Method : ");
		System.out.println("Main List --> " + input);
		System.out.println("\nList2     --> " + list2);
		System.out.println("Main List is equal to List2 : " + input.equals(list2));
		
		list2.add("Aarti");
		System.out.println("\nList2     --> " + list2);
		System.out.println("Main List is equal to List2 : " + input.equals(list2));
		System.out.println("List2 is equal to Main List : " + list2.equals(input));
		
		Collections.sort(list2,Collections.reverseOrder());
		System.out.println("\nAfter reverse order List2 --> " + list2);
		System.out.println("Main List is equal to List2 : " + input.equals(list2)); //order should be same
		System.out.println("List2 is equal to Main List : " + list2.equals(input)); //order should be same
	}
	
	static void getMethods() {
		System.out.println("Get Method :");
		System.out.println("Value at index 2 --> " + input.get(2));
		System.out.println("Value at index 0 --> " + input.get(0));
		System.out.println("Value at index size -1 --> " + input.get(input.size() - 1));
		//System.out.println("Value at index size --> " + input.get(input.size())); // out of index // RunTime Error "IndexOutOfBoundsException"
		//System.out.println("Value at index 10 --> " + input.get(10)); // out of index // RunTime Error "IndexOutOfBoundsException"
	}
	
	static void getClassMethod() {
		System.out.println("Get Class Method :");
		System.out.println("Get Class --> " + input.getClass()); // will print package name
	}
	
	static void hashCodeMethod() {
		System.out.println("Hash Code Method :");
		System.out.println("Hash Code --> " + input.hashCode());
	}
	
	public static void main(String[] args) {
		addMethod();
		System.out.println();
		addAllMethod();
		System.out.println();
		clearMethod();
		System.out.println();
		containsMethod();
		System.out.println();
		equalsMehtod();
		System.out.println();
		getMethods();
		System.out.println();
		getClassMethod();
		System.out.println();
		hashCodeMethod();
		System.out.println();
		
		
		
		
	}
}
