//Creating the class according to the given instructions
public class IntegerSet {
    //Creating an array of boolean for storing elements of sets.
    private final boolean[] integerSet = new boolean[101];

    //Constructor with no arguments
    IntegerSet() {
    }

    //Method to insert element in the array by making that index true.
    public void insertElement(int i) {
        //Using if condition to check the provided int is in the range of array or not.
        if (rangeCheck(i))
            this.integerSet[i] = true;
        else
            System.out.println("Entered number is out of range");
    }

    //Method to delete element from the array by making that index false.
    public void deleteElement(int i) {
        //Using if condition to check the provided int is in the range of array or not.
        if (rangeCheck(i)){
            //If the given int is in the range then checking this is present in the current array of not
            if (checkElement(i)){
                this.integerSet[i] = false;
            }
            else{
                System.out.println("Item is not present in the set.");
            }
        }
        else
            System.out.println("Entered number is out of range");
    }
    //To check whether the entered number by the user is in the range of array or not.
    public boolean rangeCheck(int i ){
        if (i >= 0 && i <= 100){
            return true;
        }
        else {
            return false;
        }
    }
    //Method to check whether the number is present in the array or not.
    public boolean checkElement(int i){
        if (this.integerSet[i]){
            return true;
        }
        else{
            return false;
        }
    }

    //Method to take union of two sets.
    public static void union(IntegerSet x, IntegerSet y) {
        //Array to store the union of the sets.
        boolean[] unionSet = new boolean[101];
        //Applying for loop and if and integer from 0 to 100 is present in any of the
        // set then making that index of union array true.
        for (int i = 0; i <= 100; i++) {
            if (x.integerSet[i] || y.integerSet[i]) {
                unionSet[i] = true;
            }
        }
        //Calling the print method to print set of union of the console.
        print(unionSet);
    }

    //Intersection method which find the elements present in both of the list.
    public static void intersection(IntegerSet x, IntegerSet y) {
        //Array to store elements which are present in both sets.
        boolean[] intersectionSet = new boolean[101];
        //Applying for loop and using and so if the element is present
        // in both set then it will be added in the intersection set
        for (int i = 0; i <= 100; i++) {
            if (x.integerSet[i] && y.integerSet[i]) {
                intersectionSet[i] = true;
            }
        }
        //Calling the print method to print set of intersection of the console.
        print(intersectionSet);
    }

    //Method with check to sets are equal or not.
    public String isEqualTo(IntegerSet x) {
        //Using for loop and using if condition so if any of the element at a particular index is not equal to
        //the element of other set at that index then for loop will break and it will return not equal else all entries
        //will equal and it will return set are equal.
        for (int i = 0; i <= 100; i++) {
            if (this.integerSet[i] != x.integerSet[i]) {
                return ("Sets are not equal");
            }
        }
        return ("Sets are equal");
    }

    //Method to print the elements of the integerSet array which is instance variable.
    public void print() {
        System.out.print("{ ");
        for (int i = 0; i <= 100; i++) {
            if (this.integerSet[i]) {
                System.out.print(i + ", ");
            }
        }
        System.out.println("}");
    }

    //Method to print element of set store in static variable i.e union and intersection.
    public static void print(boolean[] x) {
        System.out.print("{ ");
        for (int i = 0; i <= 100; i++) {
            if (x[i]) {
                System.out.print(i + ", ");
            }
        }
        System.out.println("}");
    }
}