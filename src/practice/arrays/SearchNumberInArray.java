package practice.arrays;

public class SearchNumberInArray {
	
	void searchNumberAndFrequency(int[] arrayNumbers,int searchNumber) {
		int count = 0;
		for(int index=0;index<arrayNumbers.length;index++) {
			if(arrayNumbers[index] == searchNumber) {
				count++;
			}
		}
		if(count == 0)
			System.out.println(searchNumber + " number is not available in given array");
		else
			System.out.println(searchNumber + " number is available in given array with frquency " + count);
	}

	public static void main(String[] args) {
		int[] arrayNumbers = {10,3,9,-99,81,3,-11};
		int searchNumber = 33;
		new SearchNumberInArray().searchNumberAndFrequency(arrayNumbers,searchNumber);
		System.out.println();
		searchNumber = 3;
		new SearchNumberInArray().searchNumberAndFrequency(arrayNumbers,searchNumber);
	}
}
