// Demonstrate method overloading.
class Overload {
    void test() {
        System.out.println("No parameters");
    }
    // Overload test for one integer parameter.
    void test(int a) {
        System.out.println("a: " + a);
    }
    // Overload test for two integer parameters.	
    void test(int a, int b) {
        System.out.println("a and b: " + a + " " + b);
    }
    // Overload test for a double parameter
    double test(double a) {
        System.out.println("double a: " + a);
        return a*a;
    }
}

public class OverloadTest {
    public static void main(String args[]) {
        Overload ol = new Overload();
        double result;

        // call all versions of test()
        ol.test();
        ol.test(10);
        ol.test(10, 20);
        result = ol.test(123.2);

        System.out.println("Result of ol.test(123.2): " + result);
    }
}
