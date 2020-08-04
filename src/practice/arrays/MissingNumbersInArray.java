package practice.arrays;

public class MissingNumbersInArray {
	
	void missingNumbers(int[] numbers,int startNum,int endNum) {
		System.out.print("\nNumbers not present: ");
		for(int index=startNum;index<=endNum;index++) {
			boolean isNumberPresent = false;
			for(int innerIndex = 0;innerIndex<numbers.length;innerIndex++) {
				if(index == numbers[innerIndex]) {
					isNumberPresent = true;
					break;
				}
			}
			if(!isNumberPresent)
				System.out.print(index + ", ");
		}
	}

	public static void main(String[] args) {
		int[] numbers = {1,2,3,4,5,7,9};
		int startNum = 1;
		int endNum = 10;
		new MissingNumbersInArray().missingNumbers(numbers,startNum,endNum);
		int[] numbers2 = {2,3,1,4,8,7,9};
		new MissingNumbersInArray().missingNumbers(numbers2,startNum,endNum);
	}
}
