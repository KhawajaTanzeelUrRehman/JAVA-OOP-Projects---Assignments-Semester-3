/*This program is throwing an error because it is calling the method x for object t2 but has not defined the method x.
So it can be correct by creating the method x.*/
public class Test2
{
public static void main(String[] args)
{
Test2 t2 = new Test2(); 
t2.x();
}
void x()
{
    //Creating a method with name x.
}
}
