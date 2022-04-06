
import java.util.Arrays;
import java.util.Scanner;

class quiz121 {

	public static void main(String[] args) {

		final int CNT = 5;

		int minval = 0;

		int minidx = 0;

		int tmp = 0;

		Scanner scnr = new Scanner(System.in);

		int N = scnr.nextInt();

		int[] numbers = new int[N];

		// read original values

		for (int i = 0; i < N; i++)

			numbers[i] = scnr.nextInt();

		// for (int i = 0; i < N; i++) {
		for (int i = 0; i < CNT; i++) {

			minval = numbers[i];

			minidx = i;

			for (int j = i; j < N; j++) {

				// find the smallest value, assign it's index and value to seperate variables

				if ((numbers[j] < minval) || (numbers[j] == 0)) {

					minval = numbers[j];

					minidx = j;

				}

			}
			// if ((minval < numbers[i]) || (numbers[i] == 0)) {

			// create a new array for sorted values

			tmp = numbers[i];

			numbers[i] = numbers[minidx];

			numbers[minidx] = tmp;

			System.out.println(Arrays.toString(numbers));
			// }

		}

		// for (int i = 0; i < N; i++) {

		// System.out.print(numbers[i] + " ");

		// }

		scnr.close();

	}

}
