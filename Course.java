public class Course {
   String cid;
   String cname;
   Integer credit;
   String grade;

    public Course(String cid, String cname, Integer credit, String grade) {

    }

    @Override
    public String toString() {
        String toSt = ("Course: "+cid+" "+cname+" "+credit+grade);
        return toSt;
        }

    
}