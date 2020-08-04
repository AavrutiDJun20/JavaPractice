package practice.arrays;

public class SecondMaxInArray {
	
	void findSecondMax(int[] array) {
		int max1 = array[0];
		int max2 = array[0];
		
		for(int index=1;index<array.length;index++) {
			if(array[index]>max1) {
				max2 = max1;
				max1 = array[index];
			}
			else if(array[index]>max2 && array[index]<max1) {
				max2 = array[index];
			}
		}
		System.out.println("Second Max : " + max2);
	}

	public static void main(String[] args) {
		int[] array = {103,104,105,100,99};
		new SecondMaxInArray().findSecondMax(array);
	}
}
