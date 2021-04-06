//Elias Sihlangu
//April 2021
//Binary Search Tree

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class AccessBSTApp {
    private BinarySearchTree StudentTree;

    public AccessBSTApp(){}


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

    public void printStudent(String StudentID){
        BinaryTreeNode Node;
        Node = StudentTree.find(new StudentData(StudentID));
        System.out.println(Node.toString());
    }



    public void printAllStudents(){

        StudentTree.preOrder();
    }

}
