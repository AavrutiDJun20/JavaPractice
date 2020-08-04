package practice.numbers;

public class ArmstrongNumber {
	
	void verifyArmstrongNumber(int number) {
		int number2 = number;
		int armstrongNumber = 0, number3 = 0;
		
		while(number2!=0) {
			number3 = number2%10;
			armstrongNumber += Math.pow(number3, 3);
			number2 = number2/10;
		}
		
		if(armstrongNumber == number) {
			System.out.println(number + " is an Armstrong Number");
		}
		else {
			System.out.println(number + " is not an Armstrong Number");
		}
	}

	public static void main(String[] args) {
		int number = 153;
		new ArmstrongNumber().verifyArmstrongNumber(number);
		number = 154;
		new ArmstrongNumber().verifyArmstrongNumber(number);
	}
}
