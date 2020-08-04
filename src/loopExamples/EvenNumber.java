package loopExamples;

public class EvenNumber {
	
	void evenNumberSum(int targetNumber) {
		
		int sum = 0;
		int number = 0;
		int count = 0;
		
		while(sum != targetNumber) {
			
			number++;
						
			if (number % 2 == 0) {
				count++;
				sum += number;				
			}
		}
		System.out.println("Total even number required for sum are: " + count);
	}
	
	public static void main(String[] args) {
		EvenNumber evenNumber = new EvenNumber();
		evenNumber.evenNumberSum(20);
	}

}
