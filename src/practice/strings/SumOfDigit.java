package practice.strings;

public class SumOfDigit {

	void findSumOfDigitInString(String input) {
		int sum = 0;
		for(int index=0;index<input.length();index++) {
			if(Character.isDigit(input.charAt(index)))
				sum += Character.getNumericValue(input.charAt(index));
		}
		System.out.println("Sum of Digit --> " + sum);
	}
	
	void findSumOfDigitInStringASCII(String input) {
		int sum = 0;
		for(int index=0;index<input.length();index++) {
			if(input.charAt(index) >= '0' && input.charAt(index) <= '9')
				sum += Character.getNumericValue(input.charAt(index));
		}
		System.out.println("Sum of Digit ASCII --> " + sum);
	}
	
	public static void main(String[] args) {
		String input = "1Hh9PR34QP";
		new SumOfDigit().findSumOfDigitInString(input);
		new SumOfDigit().findSumOfDigitInStringASCII(input);
	}
}
