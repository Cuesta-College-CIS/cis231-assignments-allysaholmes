import java.util.ArrayList;
import java.io.IOException;

public class Main {
  
    
    public static void printStudent(ArrayList<Student> slist) {
        for(int i = 0; i < slist.size(); i++) {   
            System.out.print(slist.get(i));
        }  
    }

    public void main(String[] args) throws IOException {
        ArrayList<Student> slist;

        slist = fillupStudent();
        printStudent(slist);
    }

    private ArrayList<Student> fillupStudent() {
        return null;
    }

    public static Integer findStudent(ArrayList<Student> slist) {
        int tmp = 0;
        int index = 0;
        int student = 0;

        for (int i = 0; i <slist.size(); i++) {
            if (tmp > index) {
                tmp = index;
                index = i;
                student = tmp;
            }
        }
       
        return student;
    }
   
}