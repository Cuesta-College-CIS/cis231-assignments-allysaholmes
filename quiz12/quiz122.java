
import java.util.Arrays;

import java.util.Scanner;

public class quiz122 {

	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);

		final int L = 3; // will NOT use L. Just for the extendability.

		final int M = 3;

		final int N = 2;

		int sum = 0;

		int[][] matrix1 = { { 2, 5, 10 },

				{ 3, 6, 9 },

				{ 1, 2, 3 } };

		int[][] matrix2 = { { 10, 20 },

				{ 30, 40 },

				{ 50, 60 } };

		int[][] matrix3 = new int[1][N];

		int rowidx = scnr.nextInt();

		// for (int i = 3; i < 3; i++) { starting with 3, and i < 3 . zero iteration
		for (int i = 0; i < N; i++) {
			sum = 0;
			for (int j = 0; j < M; j++) {

				sum = sum + matrix1[rowidx][j] * matrix2[j][i];

				matrix3[0][i] = sum;

			}

			System.out.println(Arrays.toString(matrix3[0]));
			// System.out.print(matrix3);

		}

	}

}