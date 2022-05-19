import java.util.Scanner;
import java.util.Arrays;

public class elFin {
    static Scanner sc = new Scanner(System.in);
    //the N, or # of Nums in array
    static int n = sc.nextInt();
    static int[] intArray = new int[n];

    public static void printArray() {
        for (int i = 0; i < n; i++) {
            intArray[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(intArray));
    }

    public static void sortArray(){
        for(int i = 0; i < n; i++) {
            for (int j = i+1; i < n; j++) {
                //idk why VSCode says tmp isn't used
                int tmp = 0;
                if (intArray[i] < intArray[j]) {
                    tmp = intArray[i];
                    intArray[i] = intArray[j];
                    intArray[j] = intArray[i];
                }
                tmp = 0;
            }
        }
        System.out.println(Arrays.toString(intArray));
    }

}