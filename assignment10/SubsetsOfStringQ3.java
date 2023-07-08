package in.ineuron.assignment10;

public class SubsetsOfStringQ3 {
	public static void printSubsets(String set) {
		printSubsetsHelper(set, "", 0);
	}

	private static void printSubsetsHelper(String set, String currentSubset, int index) {
		if (index == set.length()) {
			System.out.print("\"" + currentSubset + "\", ");
			return;
		}

		printSubsetsHelper(set, currentSubset, index + 1);

		printSubsetsHelper(set, currentSubset + set.charAt(index), index + 1);
	}

	public static void main(String[] args) {
		// Question3
		String set1 = "abc";
		System.out.print("Subsets of \"" + set1 + "\": ");
		printSubsets(set1);
		System.out.println();

		String set2 = "abcd";
		System.out.print("Subsets of \"" + set2 + "\": ");
		printSubsets(set2);
		System.out.println();

	}

}
