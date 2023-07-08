package in.ineuron.assignment10;

public class CountContiguousSubStringQ5 {
	public static int countSubstrings(String S) {
		int count = 0;

		for (int i = 0; i < S.length(); i++) {

			int j = i;
			while (j < S.length() && S.charAt(i) == S.charAt(j)) {
				count++;
				j++;
			}
		}

		return count;
	}

	public static void main(String[] args) {
		// Question 5
		String S1 = "abcab";
		System.out.println("Count of contiguous substrings in \"" + S1 + "\": " + countSubstrings(S1)); // Output: Count
																										// of contiguous
																										// substrings in
																										// "abcab": 7

		String S2 = "aba";
		System.out.println("Count of contiguous substrings in \"" + S2 + "\": " + countSubstrings(S2)); // Output: Count
																										// of contiguous
																										// substrings in
																										// "aba": 4

	}

}
