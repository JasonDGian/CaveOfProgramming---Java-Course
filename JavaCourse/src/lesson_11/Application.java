package lesson_11;

public class Application {

	public static void main(String[] args) {

		String[] words = new String[3];

		words[0] = "Hello";
		words[1] = "to";
		words[2] = "you";
		
		System.out.println(words[0]);
		
		String[] fruits = {"apple", "banana", "pear", "kiwi"};
		
		for (String fruit : fruits) {
			System.out.println(fruit);
		}
		
		
		String[] texts = new String[2];
		
		System.out.println(texts[0] + " " + texts[1]);
		
		texts[0] = "Not null anymore";
		
		System.out.println(texts[0]);

	}

}
