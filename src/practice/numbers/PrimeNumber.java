package practice.numbers;

public class PrimeNumber {
	
	void primeNumberOrNot(int number) {
		boolean isPrime = true;
		for(int index=2;index<number/2;index++) {			
			if(number % index == 0) {
				isPrime = false;
				break;
			}
		}
		if(isPrime)
			System.out.println(number + " is a Prime Number");
		else
			System.out.println(number + " is not a Prime Number");
	}
	
	void primeNumberOrNotWithinRange(int startNum,int endNum) {		
		for(int index = startNum;index < endNum;index++) {		
			boolean isPrime = true;
			for(int innerIndex=startNum;innerIndex<=index/2;innerIndex++) {
				if(index % innerIndex == 0) {
					isPrime = false;
					break;
				}
			}
			if(isPrime)
				System.out.print(index + ", ");
		}
	}
	
	public static void main(String[] args) {
		PrimeNumber primeNumber = new PrimeNumber();
		primeNumber.primeNumberOrNot(22);
		primeNumber.primeNumberOrNot(23);
		System.out.println();
		primeNumber.primeNumberOrNotWithinRange(2,100);
	}
}
