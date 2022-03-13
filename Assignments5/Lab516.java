import java.util.Scanner;
import java.util.Arrays;

public class LabProgram {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int input = scnr.nextInt();
		float[] arr = new float[input];
		float max = 0;
		int i;

		// for (i = 0; i < arr.length; i++) {
		// arr[i] = scnr.nextFloat();
		// }
		// for (i = 0; i < arr.length; i++) {
		// if (arr[i] > max) {
		// max = arr[i];
		// }
		// }
		// Combine two loops and initialize to the first element
		for (i = 0; i < arr.length; i++) {
			arr[i] = scnr.nextFloat();
			if ((i == 0) || (arr[i] > max)) {
				max = arr[i];
			}
		}
		for (i = 0; i < arr.length; i++) {
			System.out.printf("%.2f", arr[i] / max);
			System.out.print(" ");
		}
		System.out.print("\n");
	}
}