//Elias Sihlangu
//April 2021
//Binary Search Tree

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class AccessBSTApp {
    private BinarySearchTree StudentTree;

    public AccessBSTApp(){}

   /**
    * The AccessBSTApp constructor takes a text file as an argumentsBSTApp constructor takes a text file as an argument
    * i.e "oklist.txt"
    * The text file contains a list of student numbers coupled with names
    * then adds the student data to the Binary Search tree
    * using StudentId as a key
    * objects of StudentData class are added as data items to the BST nodes each time
    * @see StudentData*/
    
    public AccessBSTApp(String fileName){
        StudentTree = new BinarySearchTree();
        String StudentID;
        String StudentName;
        String studentDetails;
        try{
            Scanner read = new Scanner(new File(fileName));
            for(int i = 0; i<5000; i++){
                studentDetails = read.nextLine();
                StudentName = studentDetails.substring(10);
                StudentID = studentDetails.substring(0, 9);
                StudentTree.insert(new StudentData(StudentID, StudentName));
            }
        }
        catch (FileNotFoundException e){

        }


    }
    
    /**
     *takes student number as an argument
     * then outputs the corresponding student name 
     **/

    public void printStudent(String StudentID){
        BinaryTreeNode Node;
        Node = StudentTree.find(new StudentData(StudentID));
        System.out.println(Node.toString());
    }
 
   /**
    * prints all student numbers and corresponding names
    * in any particular order
    **/


    public void printAllStudents(){

        StudentTree.preOrder();
    }

}
