public class Activity9 {
    public static void main(String[] args)
    {int a = 1;
    int b = 2;
    int c = 7;
    int d = 8;
    int result = a + b; //result is now 3
    System.out.println(result);
    
    result = result - a; //result is now 2
    System.out.println(result);
    
    result = result * b; // result is now 4
    System.out.println(result);
    
    result = result / 2; // result is now 2
    System.out.println(result);
    
    result = result + d; // result is now 10
    result = result % c; // result is now 3
    System.out.println(result);
    }
}
