import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Scanner;

class readFile{
    FileInputStream info = new FileInputStream ("studentinfo.txt");
    ObjectInputStream useThis = new ObjectInputStream(info);
    Scanner text = new Scanner(useThis);

   public ArrayList<Object> fillupStudent() throws IOException {

    ArrayList<Object> slist = new ArrayList<Object>();
        while (text.hasNextLine()) {
            int studentID = text.nextInt();
            String studentName = text.next();
            int studentUnits = text.nextInt();
            String studentDOB = text.next();
            int numClasses = text.nextInt();
            Student s = new Student (studentID, studentName,studentUnits, studentDOB);
            slist.add(s);
            ArrayList<Object> courseList = new ArrayList<Object>();
            for (int i = 0; i < numClasses; i++) {
                String courseId = text.next();
                String courseName = text.next();
                Integer courseCredit = text.nextInt();
                Integer courseGrade = text.nextInt();
                Course c = new Course (courseId, courseName, courseCredit, courseGrade);
                courseList.add(c);
            }
        }
    return slist;
    }
}


