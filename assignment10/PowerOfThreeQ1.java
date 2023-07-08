package in.ineuron.assignment10;

public class PowerOfThreeQ1 {
	public static boolean isPowerOfThree(int n) {
		if (n <= 0) {
			return false; // Zero and negative numbers are not powers of three
		}

		while (n > 1) {
			if (n % 3 != 0) {
				return false;
			}
			n /= 3;
		}

		return true;
	}

	public static void main(String[] args) {
		// Question 1
		int n1 = 27;
		System.out.println(isPowerOfThree(n1));

		int n2 = 45;
		System.out.println(isPowerOfThree(n2));

	}

}

//Output: true
//Output: false


