package practice.collectionsProgram;

import java.util.*;

public class CountOfCharacters {
	
	static void countCharacters(char[] inputChar) {
		Map<Character,Integer> inputMap = new LinkedHashMap<Character,Integer>();
		for(char ch : inputChar) {			
			if(inputMap.containsKey(ch)) {
				inputMap.put(ch, inputMap.get(ch)+1);
			}
			else {
				inputMap.put(ch,1);
			}
		}
		System.out.println(inputMap);
	}
	
	static void countCharacterInString(String input) {
		int count = 0;
		for(int index=0;index<input.length();index++) {
			if(input.charAt(index) == 'c') {
				count++;
			}
		}
		System.out.println(count);
	}
	
	public static void main(String[] args) {
		String input = "technocredits";
		char[] inputChar = input.toCharArray();		
		countCharacters(inputChar);
		countCharacterInString(input);
	}
}