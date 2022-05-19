import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Question3 {
	public static ArrayList<Student> fillupStudent() throws FileNotFoundException {

		ArrayList<Student> slist = new ArrayList<Student>();
		// Your code
		return slist;
	}

	public static void printStudent(ArrayList<Student> slist) {
		for (int i = 0; i < slist.size(); i++) {
			System.out.println(slist.get(i));
		}
	}

	public static void main(String[] args) throws FileNotFoundException {
		ArrayList<Student> slist;

		slist = fillupStudent();
		printStudent(slist);
		// More code to test the methods in each Class Object
	}

}