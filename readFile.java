import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

class readFile{
    File info = new File ("studentinfo.txt");
    Scanner text = new Scanner(info);
    
    int studentID = text.nextInt();
    String studentName = text.next();
    int studentUnits = text.nextInt();
    String studentDOB = text.next();
    int numClasses = text.nextInt();

    ArrayList<Object> Student = new ArrayList<Object>();
    ArrayList<Object> Course = new ArrayList<Object>();
}


