package practice.strings;

public class MiddleCharacter {
	
	void findMiddleCharacter(String input) {
		if(input.length() % 2 != 0) {
			System.out.println("Middle Character in " + input + " is " + (input.charAt(input.length()/2)));
		}
		else {
			System.out.println("Middle Character in " + input + " is " + (input.charAt(input.length()/2 - 1)));
		}
	}
	
	public static void main(String[] args) {
		String input = "Harsh";
		new MiddleCharacter().findMiddleCharacter(input);
		input = "Maulik";
		new MiddleCharacter().findMiddleCharacter(input);
		input = "Aavruti";
		new MiddleCharacter().findMiddleCharacter(input);
	}

}
