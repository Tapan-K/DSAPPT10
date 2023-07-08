package in.ineuron.assignment10;

public class CalculateStringLengthQ4 {
	public static int calculateLength(String str) {
		if (str.isEmpty()) {
			return 0;
		} else {
			return calculateLength(str.substring(1)) + 1;
		}
	}

	public static void main(String[] args) {
		// Question 4
		String str1 = "Hello";
		System.out.println("Length of the string \"" + str1 + "\": " + calculateLength(str1)); // Output: Length string
																								// "Hello": 5

		String str2 = "";
		System.out.println("Length of the string \"" + str2 + "\": " + calculateLength(str2)); // Output: Length of the
																								// string "": 0

	}

}
