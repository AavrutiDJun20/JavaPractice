package practice.arrays;

public class CountCharacter {
	
	void countCharacterInName(String[] arrayNames,char ch) {
		for(int index=0;index<arrayNames.length;index++) {
			int count = 0;
			for(int innerIndex=0;innerIndex<arrayNames[index].length();innerIndex++) {
				if(String.valueOf(arrayNames[index].charAt(innerIndex)).equalsIgnoreCase(String.valueOf(ch))) {
					count++;
				}
			}
			System.out.println(arrayNames[index] + " ---> " + count);
		}
	}
	
	public static void main(String[] args) {
		String[] array = {"Aavruti","Akanksha","Aarti","Nikhil"};
		char ch = 'a';
		new CountCharacter().countCharacterInName(array,ch);
	}
}