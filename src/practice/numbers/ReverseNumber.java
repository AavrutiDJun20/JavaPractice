package practice.numbers;

public class ReverseNumber {
	
	void getReverseNumber(int number) {
		int number2 = number;
		int revNumber = 0,number3 = 0;
		
		while(number2!=0) {
			number3 = number2%10;
			revNumber = (revNumber*10) + number3;
			number2 = number2/10;
		}
		System.out.println("reverse number --> " + revNumber);
	}

	public static void main(String[] args) {
		int number = 12345;
		new ReverseNumber().getReverseNumber(number);
	}
}
