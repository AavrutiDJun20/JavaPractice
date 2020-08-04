package practice.numbers;

public class SumOfDigitsUsingSplitAndExceptionHandling {
	
	void findSumOfDigits(String input) {
		String[] array = input.split(" ");
		double sum = 0;
		for(int index=0;index<array.length;index++) {
			try {
				if(array[index].contains("th") || array[index].contains("nd") || array[index].contains("rd"))
					array[index] = array[index].replace("th","").replace("nd", "").replace("rd", "");
				sum+= Double.parseDouble(array[index]);
			}
			catch(NumberFormatException ne) {
			}
		}
		if(String.valueOf(sum).contains(".0"))
				System.out.println("Sum is " + (int)(sum));
		else
			System.out.println("Sum is " + (sum));
	}

	public static void main(String[] args) {
		SumOfDigitsUsingSplitAndExceptionHandling sumOfDigitsUsingSplitAndExceptionHandling = new SumOfDigitsUsingSplitAndExceptionHandling();
		String input = "I have 5 years and 6 months experience";
		sumOfDigitsUsingSplitAndExceptionHandling.findSumOfDigits(input);
		System.out.println();
		input = "I have 5 years experience";
		sumOfDigitsUsingSplitAndExceptionHandling.findSumOfDigits(input);
		System.out.println();
		input = "I have 5.6 years experience";
		sumOfDigitsUsingSplitAndExceptionHandling.findSumOfDigits(input);
		System.out.println();
		input = "I have 2.3 years experience in manual & 1.2 years in automation";
		sumOfDigitsUsingSplitAndExceptionHandling.findSumOfDigits(input);
		System.out.println();
		input = "2.3 years total exp and this is my 23rd org";
		sumOfDigitsUsingSplitAndExceptionHandling.findSumOfDigits(input);
	}
}
