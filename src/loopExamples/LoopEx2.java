package loopExamples;

public class LoopEx2 {
	
	void sumOf55(int expectedSum) {
		
		int sum = 0;
		int index = 0;
		
		while(sum != 59) {
			index++;
			sum = index + sum;
			
			if(sum > expectedSum){
				System.out.println("Last Number is: " + sum);
				System.out.println("Difference between the target number (" + expectedSum + ") and sum number (" + sum + ") is: " + (sum - expectedSum));
				break;
			}
		}
		System.out.println("Total required nos are: " + index);
	}
	
	void divisibleBy3(int expectedSum) {
		int sum = 0;
		int index = 0;
		int sumOfDivisibleBy3 = 0 ;
		System.out.println("\nNumber divisible by 3 are: ");
		while(sum != 55) {
			index++;
			sum = index + sum;
			if(index % 3 == 0) {
				System.out.print(index + ",");
				sumOfDivisibleBy3 = sumOfDivisibleBy3 + index;
			}
		}
		System.out.println("\nSum of Divisible by 3 are: " + sumOfDivisibleBy3);
	}
	
	
	public static void main(String[] args) {
		LoopEx2 loopEx2 = new LoopEx2();
		loopEx2.sumOf55(59);
		loopEx2.divisibleBy3(66);
	}
}
