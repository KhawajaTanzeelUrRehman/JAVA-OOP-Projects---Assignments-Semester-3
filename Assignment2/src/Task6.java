//importing Scanner library for taking input from the user.

import java.util.Scanner;

//Defining main class for the program.
public class Task6 {

    //Defining main method of the program.
    public static void main(String[] args) {
        //Defining an array of 3 rows and 4 colums for storing items of all the factories.
        int itemsData[][] = new int[3][4];

        //Calling the methode to take input from the user.
        takingInput(itemsData);

        //Calling the methode to calculate and display the total items category wise.
        calTotalItems(itemsData);
    }

    //Defining a methode which can take the number of items from the user and store it in an array for different factories.
    public static void takingInput(int array[][]) {
        //Defining an object for taking input from the user.
        Scanner input = new Scanner(System.in);

        //Using for loop to take number of items for the category bio-degrable and storing it in the array.
        for (int bioItems = 0; bioItems < 4; bioItems++) {
            System.out.print("Please enter the number of bio-degrable items of factory " + (bioItems + 1) + ": ");
            array[0][bioItems] = input.nextInt();
        }
        //Using for loop to take number of items for the category Non-biodegrable and storing it in the array.
        for (int nonBioItems = 0; nonBioItems < 4; nonBioItems++) {
            System.out.print("Please enter the number of non-biodegrable items of factory " + (nonBioItems + 1) + ": ");
            array[1][nonBioItems] = input.nextInt();
        }
        //Using for loop to take number of items for the category Recyclable and storing it in the array.
        for (int recyclableItems = 0; recyclableItems < 4; recyclableItems++) {
            System.out.print("Please enter the number of recyclable items of factory " + (recyclableItems + 1) + ": ");
            array[2][recyclableItems] = input.nextInt();
        }

    }

    //Defining a method to calculate and print the sum of all king of items.
    public static void calTotalItems(int array[][]) {
        //Making variable for storing total items for different kind in respective variabe.
        int totalBiodegrable = 0;
        int totalNonBiodegrable = 0;
        int totalRecyclable = 0;

        //Using for nested for loop to get items from 2d array.
        for (int type = 0; type < 3; type++) {
            for (int items = 0; items < 4; items++) {
                //Using if else statement for calculating and adding data in specific variable.
                if (type == 0) {
                    totalBiodegrable += array[type][items];
                } else if (type == 1) {
                    totalNonBiodegrable += array[type][items];
                } else {
                    totalRecyclable += array[type][items];
                }

            }
        }
        //Just printing the items category wise on the screen.
        System.out.println("Total Bio-degrable items of all factories: " + totalBiodegrable);
        System.out.println("Total Non-biodegrable items of all factories: " + totalNonBiodegrable);
        System.out.println("Total Recyclable items of all factories: " + totalRecyclable);
    }
}
