package in.ineuron.assignment10;

public class TowerOfHanoiQ6 {
	static void towerOfHanoi(int N, char source, char auxiliary, char destination) {
		if (N == 1) {
			System.out.println("Move disc 1 from " + source + " to " + destination);
			return;
		}

		towerOfHanoi(N - 1, source, destination, auxiliary);
		System.out.println("Move disc " + N + " from " + source + " to " + destination);
		towerOfHanoi(N - 1, auxiliary, source, destination);
	}

	static int countMoves(int N) {
		return (int) Math.pow(2, N) - 1;
	}

	public static void main(String[] args) {
		// Question 6
		int N = 3;
		towerOfHanoi(N, 'A', 'B', 'C');
		int moves = countMoves(N);
		System.out.println("Total moves: " + moves); // Output: Total moves: 7

	}

}
