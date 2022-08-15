import java.util.Scanner;//importing Scanner library for taking input from the user.
public class TaskTwo {//Defining the main classs for the program.
    public static void main(String[] args){//Defining the main function of the program.
        System.out.println("Mileage Calculator");// just printing the heading of the program.
        System.out.println("\n\nEnter -1 to calculate the average mileage");
        Scanner input = new Scanner(System.in);//Defining an object of get input from the user.
        int kilometers = 0;// Defining variable for taking kilometer of the current trip.
        int liters = 0;//Defining variable for taking liters of the current trip.
        double mileage = 0.0 ;//Defining variable for storing mileage of the current trip.
        int totalKilometers = 0;//Variable for storing total kilometers.
        int totalLiters = 0;//Variable for storing total liters.
        double totalMileage = 0.0;//variable for storing total mileages.
        int counter = 1;//Variable for printing the trip number.
        while ( kilometers != -1 && liters != -1 ){//Applying while loop for taking multiple inputs.
            //just printing and taking inputs from the user.
            System.out.printf("Please enter the number of kilometers for trip %d: ",counter);
            kilometers = input.nextInt();
            if (kilometers == -1)//Condition to exit the while loop and show the average mileage.
                break;
            System.out.printf("Please enter the number of liters for trip %d: ",counter);
            liters = input.nextInt();
            if (liters == -1)//Condition to exit the while loop and show the average mileage.
                break;
            mileage = (float)kilometers/(float)liters;//Calculating the mileage of the current trip.
            System.out.printf("\n\nThe mileage for trip %d is %f kms/liter\n",counter,mileage);
            totalKilometers += kilometers;
            totalLiters += liters;
            counter++;
        }
        totalMileage = (float)totalKilometers/(float)totalLiters;//Calculating the average mileage of the car.
        System.out.printf("\n\nThe average mileage for the car is %f \n",totalMileage);
    }
    
}
