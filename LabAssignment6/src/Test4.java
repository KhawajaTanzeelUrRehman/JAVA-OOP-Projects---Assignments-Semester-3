/*This code  is creating an object by passing an argument but has not any constructor which accept the parameter.
This program can be correct by creating the constructor which accept the parameter.*/
public class Test4
{
public static void main(String[] args)
{
C c = new C(5.0);
System.out.println(c.value);
}
}

class C
{
    double value = 2;
    C (double r)//Creating a constructor which accept the parameter.
    {
        value = r;
    }
}
