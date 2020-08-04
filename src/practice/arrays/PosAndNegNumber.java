package practice.arrays;

public class PosAndNegNumber {
	
	void posAndNegNumberCountAndSum(int[] arrayNumbers) {
		int negCount = 0,posCount = 0, negSum = 0, posSum=0, sum=0;
		for(int index=0;index<arrayNumbers.length;index++) {
			if(arrayNumbers[index]<0) {
				negCount++;
				negSum += arrayNumbers[index];
			}
			if(arrayNumbers[index]>=0) {
				posCount++;
				posSum += arrayNumbers[index];
			}
			sum += arrayNumbers[index];			
		}
		System.out.println("Positive Numbers Count --> " + posCount);
		System.out.println("Negative Numbers Count --> " + negCount);
		System.out.println();
		System.out.println("Positive Numbers Sum --> " + posSum);
		System.out.println("Negative Numbers Sum --> " + negSum);
		System.out.println();
		System.out.println("Positive & Negative Numbers Sum --> " + sum);
	}
	
	public static void main(String[] args) {
		int[] arrayNumbers = {-1,2,-3,4,-5,6,-7,8,-9};
		System.out.println("Input ---> {-1,2,-3,4,-5,6,-7,8,-9}");
		new PosAndNegNumber().posAndNegNumberCountAndSum(arrayNumbers);
	}
}