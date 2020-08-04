package practice.numbers;

public class SwapNumbers {

	public static void main(String[] args) {
		int num1 = 20;
		int num2 = 30;
		System.out.println("Number Before swap : Num1 --> " + num1 + " Num2 --> " + num2);
		//swap number		
		num1 = num1+num2;
		num2 = num1-num2;
		num1 = num1-num2;
		
		System.out.println("Number After swap  : Num1 --> " + num1 + " Num2 --> " + num2);
	}
}
