import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;

public class Student {
	Integer sid;
	String sname;
	ArrayList<Student> slist;
    Integer credit;
    File info = new File ("studentinfo.txt");
    Scanner text = new Scanner(info);

	public Student(Integer id, String name, ArrayList<Course> c) {
		sid = id;
		sname = name;
		slist = c;
        Student s = new Student(sid, sname, c);
        slist.add(s);
	}
    
   
    @Override
    public String toString (ArrayList<Student> slist) {
        String studentStr = ("Student: "+sid+" "+sname);
      return studentStr;
    }

	public String getTotalCredits() {
        String totalCredits = ("Total Credits "+credit);
        return totalCredits;
    }


    public int getId() {
        return 0;
    }

}
