public class Main {
    public static void main(String[] args) {

    int r1 = (int)(Math.random() * 101);
    int r2 = (int)(Math.random() * 101);
    int r3 = (int)(Math.random() * 101);

         if ((r1 > r2) && (r1 > r3)) {
          System.out.print(r1+" "+r2+" "+r3);
            System.out.println(r1);
         } if ((r2 > r1) && (r2 > r3)) {
          System.out.print(r1+" "+r2+" "+r3);
            System.out.println(r2);
         } else { 
            System.out.print(r1+" "+r2+" "+r3+"\n"); 
            System.out.println(r3);
    }
    }
   }
     