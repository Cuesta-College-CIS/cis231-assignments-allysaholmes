public class quiz121 {
    public static void main(String[] args) {
		final int CNT = 5;
		//initialized values
        int minval = 0;
        int minidx = 0;
        int tmp = 0;

		Scanner scnr = new Scanner(System.in);
		int N = scnr.nextInt();
		int[] numbers = new int[N];

		//read original values
        for (int i = 0; i < N; i++)
			numbers[i] = scnr.nextInt();
        //update the starting point/index of for loop
        int bounds = numbers.length;

        for (int i = 0; i < bounds-1; i++){
            minidx = i;
            for (int j = 0; j < minidx; j++){
                //find the smallest value, assign it's index and value to seperate variables
                if (numbers[j] < numbers[minidx]) {
                    minidx = j;
                }
            }
            //create a new array for sorted values
            int tmp = numbers[minidx];
            numbers[minidx] =  numbers[i];
            numbers[i] = tmp;

        }

        //for-loop to print updated numbers array
        //stop after five sorts using CNT (so we count using a for-loop too)
        for (int i = 0; i < CNT; i++)
            System.out.print(numbers[i] + " "); 
        System.out.println();
		scnr.close();
	}

}
