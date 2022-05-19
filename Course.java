public class Course implements courseActivity{
  
abstract class Person{
  public String name;
  public String dob;
  public String toString(){
    String toStr = ("Name:     "+name+" Date of birth:     "+dob);
    return toStr;
  }
  public void printPerson(){
    System.out.println(toString());
  }
}

    public Course(String courseId, String courseName, Integer courseCredit, Integer courseGrade) {
      // TODO Auto-generated stub
}

    @Override
    public void decideGrade() {
      String grade = ("null");
        if (courseGrade > 89){
            grade = "A";
        } if ((courseGrade < 90) && (courseGrade > 79)) {
            grade = "B";
        } if ((courseGrade < 80) && (courseGrade > 69)) {
            grade = "C";
        } if ((courseGrade < 70) && (courseGrade > 59)) {
            grade = "D";
        } if (courseGrade < 60) {
            grade = "F";
        }
    }

    @Override
    public void printCourseinfo() {
      // TODO Auto-generated method stub
      
    }
    
}