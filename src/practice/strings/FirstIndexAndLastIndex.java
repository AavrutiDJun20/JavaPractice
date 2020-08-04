package practice.strings;

public class FirstIndexAndLastIndex {

	void firstIndexLastIndex(String input) {
		for(int index=0;index<input.length();index++) {
			char ch = input.charAt(index);
			if(input.indexOf(ch) != input.lastIndexOf(ch) && index != input.lastIndexOf(ch))
				System.out.println(ch + " first index --> " + input.indexOf(ch) + " last index --> " + input.lastIndexOf(ch));
		}
	}
	
	public static void main(String[] args) {
		String input ="technocredits";
		new FirstIndexAndLastIndex().firstIndexLastIndex(input);
	}
}
