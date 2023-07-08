package in.ineuron.assignment10;

public class PermutationOfStringQ7 {
	public static void printPermutations(String str) {
		printPermutationsHelper(str.toCharArray(), 0);
	}

	private static void printPermutationsHelper(char[] arr, int index) {
		if (index == arr.length - 1) {
			System.out.print(new String(arr) + " ");
			return;
		}

		for (int i = index; i < arr.length; i++) {
			swap(arr, index, i);
			printPermutationsHelper(arr, index + 1);
			swap(arr, index, i);
		}
	}

	private static void swap(char[] arr, int i, int j) {
		char temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void main(String[] args) {
		// Question 7
		String str1 = "cd";
		System.out.print("Permutations of \"" + str1 + "\": ");
		printPermutations(str1);
		System.out.println(); // Output: Permutations of "cd": cd, dc

		String str2 = "abb";
		System.out.print("Permutations of \"" + str2 + "\": ");
		printPermutations(str2);
		System.out.println(); // Output: Permutations of "abb": abb ,abb, bab, bba, bab ,bba

	}

}
