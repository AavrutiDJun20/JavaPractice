package practice.numbers;

public class PalindromeNumber {

	void verifyPalindromeNumber(int number) {
		int number2 = number;
		int revNumber = 0 , number3 = 0;
		
		if(number%10 == number2%10) {
			while (number2!=0) {
				number3 = number2%10;
				revNumber = (revNumber*10) + number3;
				number2 = number2/10;
			}
			if(number == revNumber)
				System.out.println(number + " is a Palindrome Number");
			else
				System.out.println(number + " is not a Palindrome Number");
		}
		else
			System.out.println(number + " is not a Palindrome Number");
	}
	
	void verifyPalindromeNumberUsingFor(int number) {
		int number2 = number;
		int revNumber = 0 , number3 = 0;
		
		if(number%10 == number2%10) {
			for(;number2!=0;number2/=10) {
				number3 = number2%10;
				revNumber = (revNumber*10) + number3;
			}
			if(number == revNumber)
				System.out.println(number + " is a Palindrome Number");
			else
				System.out.println(number + " is not a Palindrome Number");
		}
		else
			System.out.println(number + " is not a Palindrome Number");
	}
	
	public static void main(String[] args) {
		PalindromeNumber palindromeNumber = new PalindromeNumber();
		int number = 12321;
		palindromeNumber.verifyPalindromeNumber(number);
		number = 123222;
		palindromeNumber.verifyPalindromeNumber(number);
		number = 22322;
		palindromeNumber.verifyPalindromeNumberUsingFor(number);
		number = 22321;
		palindromeNumber.verifyPalindromeNumberUsingFor(number);
	}
}
