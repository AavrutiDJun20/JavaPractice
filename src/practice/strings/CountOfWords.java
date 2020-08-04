package practice.strings;

public class CountOfWords {

	void getCountOfWords(String[] input) {
		for(int index=0;index<input.length;index++) {
			int count = 1;
			if(input[index]!="*") {
				for(int innerIndex=index+1;innerIndex<input.length;innerIndex++) {
					if(input[innerIndex].equals(input[index])) {
						count++;
						input[innerIndex] = "*";
					}
				}
				System.out.println(input[index] + " --> " + count);
			}
		}
	}
	
	public static void main(String[] args) {
		String input = "Tech_no Hi T_EchNo H_I Tech hi_";
		input = input.toLowerCase().replace("_", "");
		String[] array = input.split(" ");
		new CountOfWords().getCountOfWords(array);
	}
}