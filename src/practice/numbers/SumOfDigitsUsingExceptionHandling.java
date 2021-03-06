package practice.numbers;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SumOfDigitsUsingExceptionHandling {

	//Get values from user
	int[] getValues(int totalNumbers){
		Scanner scanner = new Scanner(System.in);
		int count = 0, sum = 0;
		String concatNumber ="";
		int[] array = new int[totalNumbers];
		while(count<totalNumbers) {
			try {
				System.out.println("Please enter number "  + (count+1) + ": ");
				array[count] = scanner.nextInt();
				sum += array[count];
				concatNumber += array[count] + ", ";
				count++;				
			}
			catch(InputMismatchException e) {
				System.out.println("Please enter Valid Number");
				scanner.nextLine();
				continue;
			}
		}
		System.out.println("Output --> values are " + concatNumber + "and total is " + sum);
		scanner.close();
		return array;
	}

	//Sum of digits
	void sumOfDigits(int totalNumbers) {
		int[] array = getValues(totalNumbers);
		int sum = 0;
		System.out.print("\nOutput --> values are ");
		for(int index=0;index<array.length;index++) {
			sum += array[index];
			System.out.print(array[index] + ", ");
		}		
		System.out.println("and total is " + sum);
	}

	public static void main(String[] args) {
		new SumOfDigitsUsingExceptionHandling().sumOfDigits(3);		
	}
} 
