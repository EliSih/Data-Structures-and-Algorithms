

public class StudentData implements Comparable<StudentData>{
    /**
     *objects of this class are used as data items
     * the data items exist within Binary Tree Nodes in the binary serach tree
     * @see AccessBstApp
     * this class also implemets the comparable interface
     * this defines parameters for comparing objects of StudentData
     * Student number is used as a comparasion parameter*/
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
        return StudentID + " " +StudentName;
    }

//    public String printStudent(String ID)

}
