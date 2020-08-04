package practice.strings;

public class PalindromeString {
	
	boolean verifyPalindromeString(String input) {
		int index = 0, innerIndex = input.length()-1;
		while(index<innerIndex) {
			if(input.charAt(innerIndex)!=input.charAt(index))
				return false;
			index++;
			innerIndex--;
		}
		return true;
	}
	
	boolean verifyPalindromeStringWithForLoop(String input) {
		for(int index=0;index<input.length();index++) {
			for(int innerIndex=input.length()-1;innerIndex>=0;innerIndex--) {
				if(input.charAt(innerIndex) != input.charAt(index))
					return false;					
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		PalindromeString palindromeString = new PalindromeString();
		String input = "rar";
		if(palindromeString.verifyPalindromeString(input))
			System.out.println(input + " is Palindrome");
		else
			System.out.println(input + " is not Palindrome");
		
		input = "saxena";
		if(palindromeString.verifyPalindromeStringWithForLoop(input))
			System.out.println(input + " is Palindrome");
		else
			System.out.println(input + " is not Palindrome");
	}

}
