import java.util.ArrayList

public class Main {
    public static ArrayList<Student> fillupStudent() {

        ArrayList<Student> slist = new ArrayList<Student>();

        //your code
        return slist;
    }
    public static void printStudent(ArrayList<Student> slist) {
        //your code
    }

    public static void printStudent(ArrayList<Student> slist, Integer id) {
        //your code
    }

    public static void main(String[] args) {
        Integer sid;
        ArrayList<Student> slist;

        slist = fillupStudent();
        printStudent(slist);
        sid = findStudent(slist);

        printStudent(slist, sid);
    }
}