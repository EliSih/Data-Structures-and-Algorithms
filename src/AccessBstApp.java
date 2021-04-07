import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class AccessBstApp {


    public static void main(String[] args) {
        BinarySearchTree testTree = new BinarySearchTree();
        try

        {

            String StudentID;
            String StudentName;
            String studentDetails;
            StudentData Student;
            Scanner s2 = new Scanner(new File("oklist.txt"));
            for (int i = 0; i < 5000; i++) {
                studentDetails = s2.nextLine();
                StudentName = studentDetails.substring(10);
                StudentID = studentDetails.substring(0, 9);
                testTree.insert(new StudentData(StudentID, StudentName));
            }
        }
        catch (FileNotFoundException e){

        }
    }

    /**
     * prints the student name that first matches the ID
     * or outputs "Access Denied"
     * if there is no match*/
//    public static String printStudent(String StudentID){
//
//    }

}
