import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class elFin {
    static Scanner sc = new Scanner(System.in);
    //the N, or # of Nums in array
    static int n = sc.nextInt();
    static int[] intArray = new int[n];

    public static void printArray() {
        for (int i = 0; i < n; i++) {
            //increments thought the intArray while saving input  
            intArray[i] = sc.nextInt();
        }
        //prints the intArray
        System.out.println(Arrays.toString(intArray));
    }

    public static void sortArray(){
        int idxFirst = 0;
        int idxLast = intArray.length;
        int idxMiddle = idxFirst + (idxLast-idxFirst)/2;

        //sorts from smallest num to largest num
        for(int i = 0; i < n; i++) {
            for(int j = i+1; i < n; j++) {
                int tmp = 0;
                tmp = intArray[i];
                if (intArray[i] < intArray[j]) {
                    intArray[i] = intArray[j];
                    intArray[j] = tmp;
                }
                //resets the temporary variable
                tmp = 0;
            }
        }
        //print the number in the middle
        System.out.println(intArray[idxMiddle]);
    }
   
 
    static int[] subArray = new int[n];

    public static void randomNumber() {
        //random number creator
        Random randNum = new Random();
        for (int i = 0; i < n; i++)
            //saves random numbers to array
            subArray[i] = randNum.nextInt();

    System.out.println(Arrays.toString(subArray));
    }

    public static void subSequence() {
        int max = 0;
        int maxi = 0;
        int maxj = 0;
        int maxk = 0;
        
        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                for(int k = j+1; k < n; k++){
                    //checks the values of subArray in sections of 3
                    if ((subArray[i]+subArray[j]+subArray[k]) > max) {
                        max = (i+j+k);
                        maxi = i;
                        maxj = j;
                        maxk = k;
                    }
                }
            }
        }
        System.out.println(subArray[maxi]+" "+subArray[maxj]+" "+subArray[maxk]);
    }

}