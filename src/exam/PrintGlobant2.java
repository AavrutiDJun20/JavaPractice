package exam;

public class PrintGlobant2 {
	
	void printGlobant2(String input) {
		int num = 0;
		int index2 = 1;
		for(int index = input.length();index >= 0;) {
			if(num < input.length()) {
				if(num == index2-1) {
					System.out.print(Character.toUpperCase(input.charAt(num)));
				}
				else {
					System.out.print(input.charAt(num));
				}
				num++;
				continue;
			}			
			if(num == input.length()) {			
				System.out.println();
				num = index2;
				index2++;
			}
			index--;
		}
	}
	
	public static void main(String[] args) {
		String input = "Globant";
		new PrintGlobant2().printGlobant2(input);
	}
}