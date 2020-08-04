package practice.strings;

public class ExtractItemId{

	void printItemId(String input){
		if (input.contains("itemId")) {
			String sub = input.substring(input.indexOf("itemId"));
			String s = sub.split("=")[1].split("&")[0].split("/")[0];
			System.out.println("ItemID is " + s);
		} else
			System.out.println("Item Id is not present");
	}

	void method2(String input) {
		try{
			String sub = input.substring(input.indexOf("itemId"));
			String s = sub.split("=")[1].split("&")[0].split("/")[0];
			System.out.println("ItemID is " + s);
		}catch(StringIndexOutOfBoundsException siob){
			System.out.println("Item Id is not present");
		}
	}

	public static void main(String[] args){
		ExtractItemId extractItemId = new ExtractItemId();
		String[] input = { "https://www.facebook.com/technocredits/temId=12345/",
				"https://www.facebook.com/technocredits/empid=123&itemId=12345/",
				" https://www.facebook.com/technocredits/itemId=12345&empid=123/",
		"https://www.facebook.com/technocredits/empid=123/" };
		for (int index = 0; index < input.length; index++){
			extractItemId.printItemId(input[index]);
		}
		System.out.println("\nmethod 2");
		for (int index = 0; index < input.length; index++){
			extractItemId.method2(input[index]);
		}
	}
}