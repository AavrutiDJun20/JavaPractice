package practice.strings;

public class CharacterMethods {

	void characterCountInString(String input) {
		int isDigitCnt = 0;
		int isLowerCaseCnt = 0;
		int isUpperCaseCnt = 0;
		int specialCharCnt = 0;
		for(int index=0;index<input.length();index++) {
			char ch = input.charAt(index);
			if(Character.isDigit(ch))
				isDigitCnt++;
			else if(Character.isUpperCase(ch))
				isUpperCaseCnt++;
			else if(Character.isLowerCase(ch))
				isLowerCaseCnt++;
			else
				specialCharCnt++;
		}
		System.out.println("Digit --> " + isDigitCnt);
		System.out.println("UpperCase --> " + isUpperCaseCnt);
		System.out.println("LowerCase --> " + isLowerCaseCnt);
		System.out.println("Letters --> " + (isUpperCaseCnt+isLowerCaseCnt));
		System.out.println("Special Characters --> " + specialCharCnt);
	}
	
	public static void main(String[] args) {
		String input ="1rRpd3F9#K(E";
		new CharacterMethods().characterCountInString(input);
	}
}
