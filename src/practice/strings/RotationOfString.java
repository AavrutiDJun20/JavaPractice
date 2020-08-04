package practice.strings;

public class RotationOfString {
	
	//RIGHT ROTATION
	static void rightRotation(String input1,String input2) {
		boolean flag = false;
		if(!input1.equals(input2) && input1.length()==input2.length()) {
			for(int index=0;index<input1.length();index++) {
				input1 = input1.charAt(input1.length()-1) + input1.substring(0,input1.length()-1);
				if(input1.equals(input2)) {
					System.out.println("Iteration -- > " + (index+1) + "\n");
					flag = true;
					break;
				}
			}
			if(flag == false) {
				System.out.println("Both Strings are not equal at any iteration\n");
			}
		}
		else if(input1.length()!=input2.length()) {
			System.out.println("Both string are not of equal length\n");
		}
		else {
			System.out.println("Both String is equal and iteration is 0\n");
		}		
	}

	//LEFT ROTATION
	static void leftRotation(String input1,String input2) {
		boolean flag = false;
		if(!input1.equals(input2) && input1.length()==input2.length()) {
			for(int index=0;index<input1.length();index++) {
				input1 = input1.substring(1,input1.length()) + input1.charAt(0);
				if(input1.equals(input2)) {
					System.out.println("Iteration -- > " + (index+1) + "\n");
					flag = true;
					break;
				}
			}
			if(flag == false) {
				System.out.println("Both Strings are not equal at any iteration\n");
			}
		}
		else if(input1.length()!=input2.length()) {
			System.out.println("Both string are not of equal length\n");
		}
		else {
			System.out.println("Both String is equal and iteration is 0\n");
		}
	}
	
	public static void main(String[] args) {
		System.out.println("RIGHT ROTATION");
		String input1 = "abcdef";
		String input2 = "defabc";
		System.out.println("Input1 --> " + input1 + " | Input2 --> " + input2);
		rightRotation(input1,input2);
		input1 = "abcdef";
		input2 = "defabcg";
		System.out.println("Input1 --> " + input1 + " | Input2 --> " + input2);
		rightRotation(input1,input2);
		input1 = "abcdef";
		input2 = "defgbc";
		System.out.println("Input1 --> " + input1 + " | Input2 --> " + input2);
		rightRotation(input1,input2);
		input1 = "abcdef";
		input2 = "abcdef";
		System.out.println("Input1 --> " + input1 + " | Input2 --> " + input2);
		rightRotation(input1,input2);
		
		System.out.println("-----------------------------------------------------");
		
		System.out.println("LEFT ROTATION");
		input1 = "abcdef";
		input2 = "defabc";
		System.out.println("Input1 --> " + input1 + " | Input2 --> " + input2);
		leftRotation(input1,input2);
		input1 = "abcdef";
		input2 = "defabcg";
		System.out.println("Input1 --> " + input1 + " | Input2 --> " + input2);
		leftRotation(input1,input2);
		input1 = "abcdef";
		input2 = "defgbc";
		System.out.println("Input1 --> " + input1 + " | Input2 --> " + input2);
		leftRotation(input1,input2);
		input1 = "abcdef";
		input2 = "abcdef";
		System.out.println("Input1 --> " + input1 + " | Input2 --> " + input2);
		leftRotation(input1,input2);
		
	}
}
