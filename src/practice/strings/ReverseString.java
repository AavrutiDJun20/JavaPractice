package practice.strings;

public class ReverseString {
	
	void getReverseString(String input) {
		String newReverseString = "";
		for(int index = input.length()-1;index>=0;index--) {
			newReverseString += input.charAt(index);
		}
		System.out.println("Reverse String of " + input + " is " + newReverseString);
	}
	
	public static void main(String[] args) {
		String input = "technocredits";
		new ReverseString().getReverseString(input);
	}

}
