import java.util.ArrayList;
import java.util.Scanner;
import java.io.IOException;

/* 
-Focus on the methods and their function within the code
-How do I access the credits for each student individually?
-Uncertain if the text file is being read or how I would access it by index
*/

public class Main {
    static Integer sid = 0;
    static String sname = "jo";
    static Integer coursenum = 0;
    static String courseId = "course id";
    static String courseName = "course name";
    static Integer courseCredit = 0;
    static String courseGrade = "A";
    static Scanner sc = new Scanner(System.in);
   // FileInputStream fileByteStream = new FileInputStream("studentinfo.txt"); // File input stream
   // Scanner inFS = new Scanner(fileByteStream);                  // Scanner object
   
    
   public static ArrayList<Student> fillupStudent() throws IOException {

    ArrayList<Student> slist = new ArrayList<Student>();
    while (sc.hasNextLine()) {
        sid = sc.nextInt();
        sname = sc.next();
        coursenum = sc.nextInt();
        ArrayList<Course> cl = new ArrayList<Course>();
        for (int i = 0; i < coursenum; i++) {
            courseId = sc.next();
            courseName = sc.next();
            courseCredit = sc.nextInt();
            courseGrade = sc.next();
            Course c = new Course (courseId, courseName, courseCredit, courseGrade);
            cl.add(c);
        }
    }
    return slist;
}
    
    public static void printStudent(ArrayList<Student> slist) {
        for(int i = 0; i < slist.size(); i++) {   
            System.out.print(slist.get(i));
        }  
    }

    public void main(String[] args) throws IOException {
        ArrayList<Student> slist;

        slist = fillupStudent();
        printStudent(slist);
        sid = findStudent(slist);

        printStudent(slist);
    }

    public static Integer findStudent(ArrayList<Student> slist) {
        int tmp = 0;
        int index = 0;
        int student = 0;

        for (int i = 0; i <slist.size(); i++) {
            if (tmp > index) {
                tmp = index;
                index = i;
                student = tmp;
            }
        }
       
        return student;
    }
   
}