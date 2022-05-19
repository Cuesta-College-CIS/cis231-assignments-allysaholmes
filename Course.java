import java.util.ArrayList;

import activity.courseActivity;

public class Course implements courseActivity{
  
abstract class Person{
  public String name;
  public String dob;
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

    public Course(String cid, String cname, Integer credit, Integer courseGrade2) {
      courseId = cid;
      courseName = cname;
      courseCredit = credit;
      courseGrade = courseGrade2;

      Course c = new Course(cid, cname, credit, courseGrade2);
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