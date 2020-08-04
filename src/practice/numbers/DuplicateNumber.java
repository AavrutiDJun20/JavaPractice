package practice.numbers;

public class DuplicateNumber {
	
	void findDuplicateNumber(int[] number) {
		String[] str = new String[number.length];
		
		System.out.print("Duplicate Numbers are ");
		for(int index=0;index<number.length;index++) {
			boolean flag = false;
			if(str[index] != "*") {
				for(int innerIndex=index+1;innerIndex<number.length;innerIndex++) {
					if(number[innerIndex] == number[index]) {
						flag = true;
						str[innerIndex] = "*";
					}
				}
				if(flag == true)
					System.out.print(number[index] + ", ");
			}
		}
	}

	public static void main(String[] args) {
		int[] number = {1,1,5,2,4,3,4,4,5,5};
		new DuplicateNumber().findDuplicateNumber(number);
	}
}
