public class Course implements courseActivity{
  
  
      public Course(String courseId, String courseName, Integer courseCredit, Integer courseGrade) {
        // TODO Auto-generated stub
  }
      @Override
      public void decideGrade() {
        String grade = ("null");
        //Referencing courseGrade from slist in readFile
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