package exam;

public class PrintGlobant {
	
	void printGlobant(String input) {
		int num = 0;
		for(int index = input.length();index >= 0;) {
			if(num < index) {
				System.out.print(input.charAt(num));
				num++;
				continue;
			}			
			if(num==index) {			
				System.out.println();
				num=0;
				index--;
			}
		}
	}
	
	public static void main(String[] args) {
		String input = "Globant";
		new PrintGlobant().printGlobant(input);
	}
}