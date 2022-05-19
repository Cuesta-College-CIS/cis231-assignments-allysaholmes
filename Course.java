import java.util.ArrayList;

public class Course implements courseActivity{
  
abstract class Person{
  public String name = "null";
  public String dob = "null";
  public String toString(){
    String toStr = ("Name: "+name+" Date of birth: "+dob);
    return toStr;
  }
  public void printPerson(){
    System.out.println(toString());
  }
}

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

    @Override
    public void decideGrade() {
      // TODO Auto-generated method stub
      
    }

    @Override
    public void printInfo() {
      // TODO Auto-generated method stub
      
    }

    
}