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
       
        int idxFirst = 0;
        int idxLast = intArray.length;
        int idxMiddle = idxFirst + (idxLast-idxFirst)/2;

        //sorts from smallest num to largest num
        for(int i = 0; i < n; i++) {
            for(int j = i+1; i < n; j++) {
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
        //print the number in the middle
        System.out.println(intArray[idxMiddle]);
    }

   //create a new array with random numbers
   static int[] subArray = new int[n];
    public static void subSequence() {
        int temp = 0;
        int min = 0;
        int max = 0;
        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                for(int k = j+1; k < n; k++){
                    if ((i+j+k) > max) {
                        max = (i+j+k);
                    } if ((i+j+k) < min) {
                        min = (i+j+k);}
                }
            }
        }
        //max is returning three seperate indexes, this probably won't work
        System.out.println(subArray[max]);
    }

}