import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Student {
	static Integer sid;
	static String sname;
	static ArrayList<Student> slist;
    Integer credit;
    File info = new File ("studentinfo.txt");
    Scanner text = new Scanner(info);
    text.info

	public Student(Integer sid2, String sname2, ArrayList<Course> c) {
    }

    //won't let me use course arraylist with student arraylist
    public static void Student(Integer id, String name, ArrayList<Course> c) {
		sid = id;
		sname = name;
		slist = null;
        Student s = new Student(id, name, null);
        slist.add(s);
	}

	public String getTotalCredits() {
        String totalCredits = ("Total Credits "+credit);
        return totalCredits;
    }


    public int getId() {
        return 0;
    }

}
