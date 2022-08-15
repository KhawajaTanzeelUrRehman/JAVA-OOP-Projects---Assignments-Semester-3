/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author khawa
 */
//Importing java.io package to deal with the files.
import java.io.*;
//Importing Scanner Package to take input from the user.
import java.util.Scanner;
//Importing StringTokenizer to seperate the worlds and find 'the' in the txt file.
import java.util.StringTokenizer;
//Defining the class to find a particular word in the file.
public class ProcessSample {
    //Main method for the execution of the program.
    public static void main(String[] args) throws IOException {
        //Creating Scanner object for taking input from the user.
        Scanner input = new Scanner(System.in);
        //Taking an input word  from the user to find in the txt file.
        System.out.print("Please enter a word to find: ");
        String wordtofind = input.nextLine();
        //Converting the word to lower case to ger rid of case sensitivity.
        wordtofind = wordtofind.toLowerCase();
        //variable to store path of the input file taken from the user.
        String file1Path;
        //Variable to store path of the output file taken from the user.
        String file2Path;
        //Variable to store data of each line.
        String lineData;
        //variable to store object of bufferedReader.
        BufferedReader bufferedreader;
        //variable to store object of FileReader class.
        FileReader filereader;
        //variable to store object of filewriter class.
        FileWriter filewriter;
        //variable to store object of bufferedWriter.
        BufferedWriter bufferedwriter;
        //Variable to count number of a particular word in a line
        int theCounter;

        //Array to store words of the line.
        String[] theCounterArray = new String[50];
        //Taking path of first file from the user.
        System.out.print("Please enter the path of the input file: ");
        file1Path = input.nextLine();
        //creating file object of the input file.
        File file1 = new File(file1Path);
        /*Using while loop and checking the input path is for a file or not.
        If it is not a path of file then poping up the dialog again and again to get
        valid input form the user.*/
        while (!(file1.isFile())) {
            System.out.print("The provided path does not contain any file.\nPlease enter the path again: ");
            file1Path = input.nextLine();
            file1 = new File(file1Path);
        }
        //Taking input for path of the 2nd file.
        System.out.print("Please enter the path of the output file: ");
        file2Path = input.nextLine();
        File file2 = new File(file2Path);
        //Using while loop and insuring that the path of input file is different from
        //the output file.
        while (file1Path.equals(file2Path)) {
            System.out.println("The Path of input file and output file is same."
                    + "\nPlease enter the path of output file again: ");
            file2Path = input.nextLine();
        }
        //If the 2nd file is already exists then printing already exists.
        if (file2.isFile()) {
            System.out.println("The file already exists in the directory");
        }//If output file is not present then creating a new file.
        else {
            System.out.println("New file has been created");
            file2.createNewFile();
        }
        //Creatng an object of fileReader class.
        filereader = new FileReader(file1);
        //Creating an object of bufferreader class to read data from the file.
        bufferedreader = new BufferedReader(filereader);
        //Creatng an object of fileWriter class.
        filewriter = new FileWriter(file2);
        //Creating an object of bufferredWriter class to write data from the file.
        bufferedwriter = new BufferedWriter(filewriter);
        //Using while loop to read all lines from the file.
        while ((lineData = bufferedreader.readLine()) != null) {
            //Initiallizing counter from zero in each loop to count the in each line.
            theCounter = 0;
            //Using StringTokenizer ot seperate the words
            StringTokenizer st = new StringTokenizer(lineData);
            //Using for loop to count number of particular word in the line.
            for (int i = 0; i < st.countTokens(); i++) {
                theCounterArray[i] = st.nextToken();
                String a = theCounterArray[i].toLowerCase();
                //Using condition to check the word is equal to required word or not.
                if (a.equals(wordtofind)) {
                    theCounter++;
                }
            }
            //Writing data of each line and writing number of particular
            //word in the line in the output file.
            bufferedwriter.write(lineData + " [" + theCounter + "].\n");
        }
        //Using flush to write immediately.
        bufferedwriter.flush();
        //Printing the size of file in Kile bytes.
        System.out.println("The size of the output file is " + (file2.length() / 1000.0) + " kbs.");
        //closing the files.
        bufferedreader.close();
        bufferedwriter.close();

    }
}
