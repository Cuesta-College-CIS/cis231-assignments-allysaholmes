abstract class Person{
    String name;
    String dob;
    public  String toString(){
    String toStr = ("Name:     "+name+" Date of birth:     "+dob);
    return toStr;
    }
    public void printPerson(){
      System.out.println(toString());
    }
  }

public interface Student extends Person {

    int studentID = 0000;
    String studentName = "nullName";
    int studentUnits = 0;
    String studentDOB = "00/00/0000";

}
