//Elias Sihlangu
//April 2021
//Access Array App

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class AccessArrayApp {
    private String[] Students;

//    public AccessArrayApp(){ }

    int opCount = 0;

    /**
     * A text file is read into a data structure when the constructor is invoked
     * i.e "oklist.txt"
     * The file contains a list of student numbers coupled with names
     * The file is read into a linear data(array) structure line by line
     * exception handling is implemented to handle errors
     * */
    public AccessArrayApp(){
        Students =  new String[5000];
        try {
            Scanner read = new Scanner(new File("/home/elisih/Assignment1/src/oklist.txt"));
            for(int i=0; i<5000; i++)
                Students[i] = read.nextLine();
        }

        catch (FileNotFoundException e){

        }
    }

    /**
     * This method accepts Student number as an argument
     * then searches through the data structure using Student number as a search key
     * if matching student number is found it prints the corresponding student name
     * the number of operations done during search is iteratively stored in
     * the integer instance variable "opCount"
     * */
    public  void printStudent(String StudentID){
        String StudentName;
        String identity;
        boolean notFound = true;
        for(int i=0; i<5000; i++)
        {
            opCount++;
            StudentName = Students[i].substring(10);
            identity = Students[i].substring(0, 9);
            if(identity.equals(StudentID))
            {
                System.out.println( StudentName);
                notFound = false; 
                break;
            }
        }
        if(notFound)
            System.out.println("Access denied!");
    }

    /**
     * print all student numbers and corresponding names*/
    public  void printAllStudents(){
        for(int i=0; i<5000; i++){
            System.out.println(Students[i]);
        }
    }

    public static void main(String[] args) {
        AccessArrayApp accessArray = new AccessArrayApp();
        if(args.length == 0)
            accessArray.printAllStudents();
        else
            accessArray.printStudent(args[0]);
    }



}
