import java.util.ArrayList;
import java.util.Scanner;

public class Course {
   String courseId;
   String courseName;
   Integer courseCredit;
   String courseGrade;
   ArrayList<Course> clist;

    public Course(String cid, String cname, Integer credit, String grade) {
      courseId = cid;
      courseName = cname;
      courseCredit = credit;
      courseGrade = grade;

      Course c = new Course(cid, cname, credit, grade);
      clist.add(c);

    }

    @Override
    public String toString() {
        String toSt = ("Course: "+courseId+" "+courseName+" "+courseCredit+" "+courseGrade);
        return toSt;
        }

    
}