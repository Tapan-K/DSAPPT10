package in.ineuron.assignment10;

public class CountConsonantQ8 {
	public static int countConsonants(String str) {
		int count = 0;
		str = str.toLowerCase(); // Convert the string to lowercase for case-insensitive matching

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (isConsonant(ch)) {
				count++;
			}
		}

		return count;
	}

	private static boolean isConsonant(char ch) {

		return Character.isLetter(ch) && !isVowel(ch);
	}

	private static boolean isVowel(char ch) {
		ch = Character.toLowerCase(ch);
		return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
	}

	public static void main(String[] args) {
		// Question 8
		String str1 = "abc de";
		System.out.println("Number of consonants in \"" + str1 + "\": " + countConsonants(str1)); // Output: Number of
																									// consonants in
																									// "abc de": 3

		String str2 = "geeksforgeeks portal";
		System.out.println("Number of consonants in \"" + str2 + "\": " + countConsonants(str2)); // Output: Number of
																									// consonants in
																									// "geeksforgeeks
																									// portal": 12

	}

}
