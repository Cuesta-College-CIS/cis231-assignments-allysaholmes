import java.util.ArrayList;
import java.util.Scanner;
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;

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
   
    
    public static ArrayList<Student> fillupStudent() {

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

    public static void printStudent(ArrayList<Student> slist, Integer id) {
        for(int i = 0; i < slist.size(); i++) {   
            slist.get(i);
            if(slist.get(i) != null)
        return;
    }

    public void main(String[] args) {
        Integer sid;
        ArrayList<Student> slist;

        slist = fillupStudent();
        printStudent(slist);
        sid = findStudent(slist);

        printStudent(slist, sid);
    }

    public static Integer findStudent(ArrayList<Student> slist) {
        Integer tmp = 0;
        Integer index = 0;
        Integer student = 0;
        int id = 0;

        for (int i = 0; i <slist.size(); i++) {
            tmp = (slist.get(i)).getTotalCredits();
            if (tmp > index) {
                index = i;
                student = tmp;
            }
        }
        id = (slist.get(index)).getId();
        return id;
        
    }
   
}