public class Box 
{
    double Length; //Length of Box.
    double Breadth;   //Breadth of Box.
    double Height;    //Height of Box.
    
    public static void main(String[] args)
    {
        Box b1 = new Box();
        Box b2 = new Box();

        b1.Length = 5;
        b1.Breadth=1;
        b1.Height=1;

        b2.Length = 5;
        b2.Breadth=1;
        b2.Height=1;
        if (b1.equals(b2 ))
        {
            System.out.println("Equal");
        }
        else
            System.out.println("Not Equal");

    }
    boolean equals(Box b)
    {
        boolean equal;
        equal = false;
        if (Length == b.Length && Breadth == b.Breadth && Height == b.Height )
        {
            equal = true;     
        }
    return equal;    
    }
}
