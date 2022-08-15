/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author khawa
 */
//Importing java.io.File to deal with the files.
import java.io.File;
//Defining a class to get all files of the netbean directory.
public class Task1 {
    //Main method for the execution of the program.
    public static void main (String [] args){
        //Creating a file object and giving the path of the netbeans folder.
        File file = new File("C:\\Users\\khawa\\OneDrive\\Documents\\NetBeansProjects");
        //Get the list of files and directory and storing it in an array of String.
        String[] filesList = file.list();
        //Using for each loop to print the files on the console.
        for (String i : filesList){
            System.out.println(i);
        }
    }
}
