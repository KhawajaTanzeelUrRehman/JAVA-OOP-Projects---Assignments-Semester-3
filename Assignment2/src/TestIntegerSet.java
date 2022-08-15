//Class to test the IntegerSet class.
public class TestIntegerSet {
    //Main method for the execution of the program.
    public static void main(String[] args) {
        //Creating 4 objects of IntegerSet class which represent sets.
        IntegerSet set1 = new IntegerSet();
        IntegerSet set2 = new IntegerSet();
        IntegerSet set3 = new IntegerSet();
        IntegerSet set4 = new IntegerSet();
        //Just printing the elements of the 4 sets.
        System.out.print("The elements of set1 are: ");
        set1.print();
        System.out.print("The elements of set2 are: ");
        set2.print();
        System.out.print("The elements of set3 are: ");
        set3.print();
        System.out.print("The elements of set4 are: ");
        set4.print();
        //Heading for checking the insertElement method.
        System.out.println("\n\nChecking insertElement method");

        //Calling the insertElement method and inserting elements in the set1.
        set1.insertElement(2);
        set1.insertElement(4);
        set1.insertElement(6);
        set1.insertElement(8);
        set1.insertElement(10);

        //Entering a number which is out of range to check rangeCheck Method
        set1.insertElement(101);

        //Calling the insertElement method and inserting elements in the set2.
        set2.insertElement(2);
        set2.insertElement(4);
        set2.insertElement(6);
        set2.insertElement(8);
        set2.insertElement(10);
        set2.insertElement(12);

        //Calling the insertElement method and inserting elements in the set3.
        set3.insertElement(3);
        set3.insertElement(6);
        set3.insertElement(9);
        set3.insertElement(12);
        set3.insertElement(15);
        set3.insertElement(18);

        //Calling the insertElement method and inserting elements in the set4.
        set4.insertElement(6);
        set4.insertElement(12);
        set4.insertElement(18);
        set4.insertElement(24);
        set4.insertElement(30);

        //Now printing the new values of sets on the console.
        System.out.println("New values of set1, set2, set3 and set4 are: ");
        System.out.print("The elements of set1 are: ");
        set1.print();
        System.out.print("The elements of set2 are: ");
        set2.print();
        System.out.print("The elements of set3 are: ");
        set3.print();
        System.out.print("The elements of set4 are: ");
        set4.print();
        System.out.println();

        //Heading for checking the deleteElement method.
        System.out.println("\n\nChecking for deleteElement method");

        //Calling deleteElement method and deleting one element from the set2.
        System.out.println("Deleting 12 from the set2: ");
        set2.deleteElement(12);
        //Printing new value of set 2.
        System.out.print("The elements of set2 are: ");
        set2.print();

        //Trying to delete the element which is not present in the set to check the checkElement Method.
        System.out.println("\nTrying to delete 45 from object4 which is not present in the set: ");
        set4.deleteElement(45);
        System.out.print("The elements of set4 are: ");
        set4.print();



        //Heading for checking union method.
        System.out.println("\n\nChecking union method");

        //Calling the union method which will take union of set2 and set3 and display it on the console.
        System.out.print("The union of set2 and set3 is: ");
        IntegerSet.union(set2, set3);


        System.out.println("\n\nChecking intersection method");
        //Calling the intersection method which will take intersection of set3 and set4 and display it on the console.
        System.out.print("The intersection of set3 and set 4 is: ");
        IntegerSet.intersection(set3, set4);

        //Heading for checking isEqualTo method.
        System.out.println("\n\nChecking isEqualTo method");

        //Calling isEqualTo method which is checking whether set 1 and set2 are equal or not and printing the result on the console.
        System.out.println("For set1 and set2: " + set1.isEqualTo(set2));
        //Calling isEqualTo method which is checking whether set 3 and set4 are equal or not and printing the result on the console.
        System.out.println("For set1 and set3: " + set3.isEqualTo(set4));
    }
}
