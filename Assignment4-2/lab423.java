import java.util.Scanner; 

public class lab423 {
   public static void main(String[] args) {
   Scanner sc = new Scanner (System.in);
    
   int userInput = sc.nextInt();
   float counter = 0;
   int max = 0;
   // int min = 0; 
   int min = Interger.MAX_VALUE; 
   int sum = 0;
   float average = 0;
   
   while (userInput >= 0) {
      counter++;
      sum += userInput;
        
      max = Math.max(max, userInput);
      min = Math.min(min, userInput);
      userInput = sc.nextInt();
      if (userInput < 0) {
         break;
         }
     }
     
   sum = (sum-min);
   sum = (sum-max);
	   System.out.println(sum + " " + counter);
   if (sum!=0) {
      average = (sum/(counter-2));
      }
   
     
   System.out.printf(sum+" ");
   System.out.printf("%.2f\n", average);
      }
   }