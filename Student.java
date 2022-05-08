import java.util.ArrayList;

public class Student {
    Integer sid;
    String sname;
    ArrayList<Course> clist;

    public static Student(int id, String name, ArrayList course) {

    }

    //while loop might belong in different class
    while (sc.hasNextLine()) {
        sid = sc.nextInt();
        sname = sc.next();
        coursenum = sc.nextInt();
        ArrayList<Course> cl = new ArrayList<Course>();
        for (int i = 0; i < coursenum; i++) {
            cid = sc.next();
            cname = sc.next();
            credit = sc.nexstInt();
            grade = sc.next();
            Course c = new Course (cid, cnamne, credit, grade);
            cl.add(c);
        }
        Student s = new Student(sid, sname, cl);
        slist.add(s);
    }

    public Integer getTotalCredits();

    public String toString();

    
}