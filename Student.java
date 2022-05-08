import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Student {
    static Integer sid;
    static String sname;
    static int coursenum;
    static int cid;
    static String cname;
    static Integer credit;
    static String grade;
    static FileInputStream fileByteStream = null; // File input stream
    static Scanner sc = new Scanner(System.in);

    public static String readStudents(ArrayList<Student> studentList) throws IOException {
        File fp = new File("studentinfo.txt");
        try (Scanner sc = new Scanner(fp)) {
            while (sc.hasNextLine()) {
                sid = sc.nextInt();
                sname = sc.next();
                coursenum = sc.nextInt();
                ArrayList<Course> cl = new ArrayList<Course>();
                for (int i = 0; i < coursenum; i++) {
                    cid = sc.nextInt();
                    cname = sc.next();
                    credit = sc.nextInt();
                    grade = sc.next();
                    Course c = new Course (cid, cname, credit, grade);
                    cl.add(c);
                }
            }
        }
        
    }
   

    
} 