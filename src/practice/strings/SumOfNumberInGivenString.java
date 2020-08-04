package practice.strings;

public class SumOfNumberInGivenString {

	void findSumOfNumbers(String input) {
		int sum=0;
		String temp = "";
		for(int index=0;index<input.length();index++) {
			if(Character.isDigit(input.charAt(index))) {
				temp += input.charAt(index);
			}
			else if(!temp.equals("")) {
				sum += Integer.parseInt(temp);
				temp = "";
			}		
		}
		sum = !temp.equals("") ? (sum + Integer.parseInt(temp)) : sum;
		System.out.println("Sum of Digit is : " + sum);
	}
	
	public static void main(String[] args) {
		String input = "56a1b2c3d45e33"; //140
		new SumOfNumberInGivenString().findSumOfNumbers(input);
	}
}
