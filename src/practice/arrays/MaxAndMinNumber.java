package practice.arrays;

public class MaxAndMinNumber {
	
	void maxAndMinFromArray(int[] arrayOfNumbers) {
		int max = arrayOfNumbers[0];
		int min = arrayOfNumbers[0];
		for(int index = 1;index<arrayOfNumbers.length;index++) {
			if(arrayOfNumbers[index]>max) {
				max=arrayOfNumbers[index];
			}
			if(arrayOfNumbers[index]<min) {
				min=arrayOfNumbers[index];
			}
		}
		System.out.println("Max number is " + max);
		System.out.println("Min number is " + min);
	}

	public static void main(String[] args) {
		MaxAndMinNumber maxAndMinNumber = new MaxAndMinNumber();
		int[] array = {10,20,100,99,56};
		maxAndMinNumber.maxAndMinFromArray(array);
		int[] array1 = {-10,-20,-100,-99,-56};
		maxAndMinNumber.maxAndMinFromArray(array1);
	}
}
