/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author khawa
 */
//Importing java.io module to deal with the files.
import java.io.*;
//Importin StringTokenizer module to count space saperated worlds in the file.
import java.util.StringTokenizer;
//Defining the class to count the lines and number of the words in a file.
public class Task2 {
    //Main method for the execution of the program/
    public static void main(String[] agrs){
        //Creating a file object and passing the path to the file.
        File file = new File("C:\\Users\\khawa\\OneDrive\\Documents\\Semester 2\\Object Oriented Programming\\LAB REPORTS\\LAB12\\Task2.txt");
        
        //Variable to data of each line in the file.
        String linedata;
        //variable to count the number of lines.
        int linecounter = 0;
        //variable to count the number of worlds in the file.
        int wordscounter = 0;
        //Using try catch statement to get rid of error while handling the file.
        try{
            //Creating an objecto of the fileReader class.
            FileReader fr = new FileReader(file);
            //Creating ab object of the BufferedReader class.
            BufferedReader br = new BufferedReader(fr);
            //Using whle loop and getting the lines of file by using readLing method which return single line in each loop.
            while ((linedata=br.readLine()) != null){
                //For each line increasing the linecounter.
                linecounter++;
                //Using StringTokenizer to count number of world in the line.
                StringTokenizer st= new StringTokenizer(linedata);
                wordscounter += st.countTokens();
                
            }
            //If getting any exeption then printing it on the console.
        }catch(Exception e){
            System.err.print(e);
        }finally{
            //Just printing the number of lines and the words in the file on the console.
            System.out.println("Total number of lines in the text file are: "+linecounter+".\nTotal number of worlds in the text file are: "+wordscounter);
        }
    }
}
