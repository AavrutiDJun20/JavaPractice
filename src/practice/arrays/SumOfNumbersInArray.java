package practice.arrays;

public class SumOfNumbersInArray {
	
	void sumOfNumbers(int[] array, int number) {
		for(int index=0;index<array.length;index++) {
			for(int innerIndex=index+1;innerIndex<array.length;innerIndex++) {
				if(array[index]+array[innerIndex] == number) {
					System.out.println("(" + array[index] + ", " + array[innerIndex] + ")");
					break;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		int[] arr1 = {2, 4, 3, 5, 7, 8, 9 , -1, 0};
		int number = 7;
		new SumOfNumbersInArray().sumOfNumbers(arr1,number);
	}

}
