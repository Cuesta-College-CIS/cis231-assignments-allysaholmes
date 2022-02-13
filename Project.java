/* 
    print random numbers in acsending order
*/
public class Project {
    public static void main(String[] args) {

    int r1 = (int)(Math.random() * 101);
    int r2 = (int)(Math.random() * 101);
    int r3 = (int)(Math.random() * 101);

         if ((r3 > r2) && (r2 > r1)) {
             System.out.print(r1+" "+r2+" "+r3);
            } if ((r2 > r1)&& (r1 > r3)) {
            System.out.print(r3+" "+r1+" "+r2);
         } if ((r1>r3) && (r3> r2)) {
            System.out.print(r2+" "+r3+" "+r1);
         }
    }
    }