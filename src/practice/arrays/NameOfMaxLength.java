package practice.arrays;

public class NameOfMaxLength {
	
	void maxLengthName(String[] arrayNames) {
		String str = arrayNames[0];
		for(int index=1;index<arrayNames.length;index++) {
			if(arrayNames[index].length()>str.length()) {
				str = arrayNames[index];
			}
		}
		System.out.println("Name with max length is : " + str);
	}
	
	public static void main(String[] args) {
		String[] array = {"Aavruti","Akanksha", "Avi", "Akankshas"};
		new NameOfMaxLength().maxLengthName(array);
	}
}
