package practice.collectionsProgram;
import java.util.*;
public class CountString {

	static void countStringInput(String[] strInput) {
		Map<String,Integer> inputMap = new LinkedHashMap<String,Integer>();
		
		for(String name : strInput) {
			if(inputMap.containsKey(name)) {
				inputMap.put(name, inputMap.get(name)+1);
			}
			else {
				inputMap.put(name, 1);
			}
		}		
		System.out.println(inputMap);
	}
	
	public static void main(String[] args) {
		String input = "Hi Globant Hello Globant Hi Hello Globant";
		String[] strInput = input.split(" ");
		countStringInput(strInput);
	}
}
