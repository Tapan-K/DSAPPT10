package in.ineuron.assignment10;

public class LastNumberRemainingQ2 {
	public static int lastRemaining(int n) {
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = i + 1;
		}

		boolean leftToRight = true;
		int remaining = n;

		int step = 1;
		int index = 0;

		while (remaining > 1) {
			if (leftToRight || remaining % 2 == 1) {
				index += step;
			}

			remaining /= 2;
			step *= 2;
			leftToRight = !leftToRight;
		}

		return arr[index];
	}

	public static void main(String[] args) {
		// Question 2
		int n1 = 9;
		System.out.println("Last number remaining: " + lastRemaining(n1)); // Output: 6

		int n2 = 5;
		System.out.println("Last number remaining: " + lastRemaining(n2));

	}

}

//Output: 6
//Output: 4
