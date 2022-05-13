import java.util.ArrayList;
import java.util.Scanner;
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;

public class Main {
    static Integer sid = 0;
    static String sname = "jo";
    static Integer coursenum = 0;
    static String cid = "course id";
    static String cname = "course name";
    static Integer credit = 0;
    static String grade = "A";
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
                cid = sc.next();
                cname = sc.next();
                credit = sc.nextInt();
                grade = sc.next();
                Course c = new Course (cid, cname, credit, grade);
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
        return;
    }

    public static void main(String[] args) {
        Integer sid;
        ArrayList<Student> slist;

        slist = fillupStudent();
        printStudent(slist);
        sid = findStudent(slist);

        printStudent(slist, sid);
    }

    private static Integer findStudent(ArrayList<Student> slist) {
        return null;
    }
   
}