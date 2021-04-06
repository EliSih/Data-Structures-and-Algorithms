

public class StudentData implements Comparable<StudentData>{
   /**
    *This class creates comparable objects containing student details
    * i.e Student number and corresponding student identity
    * objects of this class are added as data items to
    * the nodes of the binary search tree class
    * this makes comparisons between data items intuitive
    * @see AccessArrayApp*/	

    String StudentID;
    String StudentName;

    public StudentData(){
        StudentID = "";
        StudentName = "";
    }

    public StudentData(String StudentID){
        this.StudentID = StudentID;
        this.StudentName = "";
    }

    public StudentData(String StudentID, String StudentName){
        this.StudentID = StudentID;
        this.StudentName = StudentName;
    }

    public int compareTo (StudentData other){
       return StudentID.compareTo(other.StudentID);
    }

    public String getStudentName(){
        return this.StudentName;
    }

    public String toString(){
        return StudentName;
    }



}
