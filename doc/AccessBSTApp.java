//Elias Sihlangu
//April 2021
//Binary Search Tree

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class AccessBSTApp {
    private BinarySearchTree StudentTree;

//    public AccessBSTApp(){}

    /**
     *here, the file "oklist.txt" is read into a data Structure
     * File contains student numbers coupled with names
     * The file is read line by line into a BinarySearchTree Data Structure
     * a new object of StudentData is created each. these objects act as data items
     * the objects have student number and name as their data fields.
     * @see StudentData
     * features FileNotFoundException handling*/
    public AccessBSTApp(){
        StudentTree = new BinarySearchTree();
        String StudentID;
        String StudentName;
        String studentDetails;
        try{
            Scanner read = new Scanner(new File("/home/elisih/Assignment1/src/oklist.txt"));
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
     * Accepts Student number as an argument then use it as a search key
     * the method find of class BinarySearchTree is used to search through the data structure
     * if there a student number matching the key, the corresponding student name printed
     * if no match is found: print "Access Denied!"
     * the number of operations performed during search is kept
     * then printed at the end of the operation*/
    public void printStudent(String StudentID){
        BinaryTreeNode Node;
        try{
            Node = StudentTree.find(new StudentData(StudentID));
            System.out.println(Node.toString());
//            System.out.println("Operations:" + StudentTree.opCount);
        }
        catch (NullPointerException e){
            System.out.println("Access Denied!");
//            System.out.println("Operations:" + StudentTree.opCount);
        }
    }


    /**prints the list of student numbers with corresponding student names */
    public void printAllStudents(){

        StudentTree.inOrder();
    }

    public static void main(String[] args) {
        AccessBSTApp bst = new AccessBSTApp();
        if (args.length == 0)
            bst.printAllStudents();
        else
            bst.printStudent(args[0]);
    }




}
