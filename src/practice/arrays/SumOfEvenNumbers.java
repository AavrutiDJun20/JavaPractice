package practice.arrays;

public class SumOfEvenNumbers {
	
	void sumOfEven(int[] arrayNumbers){
		int sum = 0;
		for(int index=0;index<arrayNumbers.length;index++) {
			if(arrayNumbers[index] % 2 == 0) {
				sum += arrayNumbers[index];
				System.out.print(arrayNumbers[index] + ", ");
			}
		}
		System.out.println("\nSum of even numbers are : " + sum);
	}

	public static void main(String[] args) {
		int[] arrayNumbers = {1,2,3,4,5,6,7,8,9,0};
		new SumOfEvenNumbers().sumOfEven(arrayNumbers);
	}
}
