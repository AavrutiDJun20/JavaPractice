package practice.arrays;

public class CharacterFrequency {
	
	void charcFreqInName(String name,char ch) {
		int count = 0;
		for(int index=0;index<name.length();index++) {
			if(String.valueOf(name.charAt(index)).equalsIgnoreCase(String.valueOf(ch))) {
				count++;
			}
		}
		System.out.println(ch + " Character Frequency in " + name + " is " + count );
	}
	
	void allCharFreqInName(String name) {
		for(int index=0;index<name.length();index++) {
			charcFreqInName(name,name.charAt(index));
		}
	}
	
	void charFrequencyinArray(String[] array) {
		for(int index=0;index<array.length;index++) {
			allCharFreqInName(array[index]);
			System.out.println("========================================");
		}
	}
	
	
	public static void main(String[] args) {
		CharacterFrequency characterFrequency = new CharacterFrequency();
		String name = "Technocredits";
		char ch = 't';
		characterFrequency.charcFreqInName(name,ch);
		System.out.println();
		characterFrequency.allCharFreqInName(name);
		System.out.println();
		String[] str = {"Aavruti","Akanksha","Aarti"};
		characterFrequency.charFrequencyinArray(str);
	}

}
