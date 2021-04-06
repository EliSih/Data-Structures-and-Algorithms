//Elias Sihlangu
//April 2021
//Access Array App

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class AccessArrayApp {
    private String[] Students;

    public AccessArrayApp(){

    }
   /**  
    * The constructor takes the fileName as an argument
    * then read the file into an array line by line
    * such that each element is a string containing
    * a student's ID and name */

    public AccessArrayApp(String fileName){
        Students =  new String[5000];
        try {
            Scanner read = new Scanner(new File(fileName));
            for(int i=0; i<5000; i++)
                Students[i] = read.nextLine();
        }

        catch (FileNotFoundException e){

        }
    }
     /**
      * prints the student name that first matches the ID
      * or outputs "Access Denied"
      * if there is no match*/

    public  String printStudent(String StudentID){
        String StudentName;
        String identity;
        for(int i=0; i<5000; i++){
            StudentName = Students[i].substring(10);
            identity = Students[i].substring(0, 9);
            if(identity.equals(StudentID))
                return StudentName;
        }
        return "Access denied!";
    }
  
  
   /**
    * prints student Id and names
    * in any order
    * i.e not ordered*/

    public  void printAllStudents(){
        for(int i=0; i<5000; i++){
            System.out.println(Students[i]);
        }
    }

}