package practice.collectionsProgram;

import java.util.LinkedHashMap;
import java.util.Map;

public class CountParticularString {
	
	static void countString(String[] strInput) {
		Map<String,Integer> inputMap = new LinkedHashMap<String,Integer>();
		
		for(String name : strInput) {
			if(name.equals("Globant")) {
				if(inputMap.containsKey("Globant")) {
					inputMap.put("Globant", inputMap.get("Globant") +1);
				}
				else {
					inputMap.put("Globant", 1);
				}
			}
		}
		System.out.println(inputMap);
	}

	static void countStringWithoutUsingCollection(String[] strInput) {
		int count = 0;
		for(String name : strInput) {
			if(name.equals("Globant")) {
				count++;
			}
		}
		System.out.println("Count of Globant is " + count);
	}
	
	public static void main(String[] args) {
		String input = "Hi Globant Hello Globant Hi Hello Globant";
		String[] strInput = input.split(" ");
		countString(strInput);
		countStringWithoutUsingCollection(strInput);
	}
}
