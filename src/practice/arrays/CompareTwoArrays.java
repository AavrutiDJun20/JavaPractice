package practice.arrays;

public class CompareTwoArrays {
	
	void findOneValueDifferInArray(int[] arr1,int[]arr2) {
		if(arr1.length == arr2.length) {
			for(int index=0;index<arr1.length;index++) {
				if(arr1[index] != arr2[index]) {
					System.out.println("Array values are not identical at index --> " + index);
					return;
				}
			}
		}
		else
			System.out.println("The two array are not identical");
	}
	
	void findAllValueDifferInArray(int[] arr1,int[]arr2) {
		if(arr1.length == arr2.length) {
			for(int index=0;index<arr1.length;index++) {
				if(arr1[index] != arr2[index]) {
					System.out.println("Array values are not identical at index --> " + index);
				}
			}
		}
		else
			System.out.println("The two array are not identical");
	}
	
	void maxValueFromTwoArray(int[] arr1,int[]arr2) {
		if(arr1.length == arr2.length) {
			for(int index=0;index<arr1.length;index++) {
				if(arr1[index] > arr2[index]) {
					System.out.println("Array values are not identical at index --> " + index + ", From (" + arr1[index] + "," + arr2[index] + ") max value is " + arr1[index]);
				}
				else if(arr2[index] > arr1[index]) {
					System.out.println("Array values are not identical at index --> " + index + ", From (" + arr1[index] + "," + arr2[index] + ") max value is " + arr2[index]);
				}
			}
		}
		else
			System.out.println("The two array are not identical");
	}
	
	void findAllDifferStringInArray(String[] arr1,String[] arr2) {
		if(arr1.length == arr2.length) {
			for(int index=0;index<arr1.length;index++) {
				if(!arr1[index].equalsIgnoreCase(arr2[index])) {
					System.out.println("Array values are not identical at index --> " + index + ", [arr1 value is " + arr1[index] + " and arr2 value is " + arr2[index] + " ]");
				}
			}
		}
		else
			System.out.println("The two array are not identical");
	}
	
	public static void main(String[] args) {
		CompareTwoArrays compareTwoArrays = new CompareTwoArrays();
		int[] array1 = {1,2,3,4,5,6};
		int[] array2 = {1,2,3,4,6,7};
		compareTwoArrays.findOneValueDifferInArray(array1,array2);
		System.out.println();
		compareTwoArrays.findAllValueDifferInArray(array1,array2);
		System.out.println();
		compareTwoArrays.maxValueFromTwoArray(array1,array2);
		System.out.println();
		String[] strArray1 = {"Aavruti","Akanksha","Aarti"};
		String[] strArray2 = {"Aavruti","Aarti","Akanksha"};
		compareTwoArrays.findAllDifferStringInArray(strArray1,strArray2);
		
	}
}
