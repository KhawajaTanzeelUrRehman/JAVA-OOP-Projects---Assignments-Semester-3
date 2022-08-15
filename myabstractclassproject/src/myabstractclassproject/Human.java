package myabstractclassproject;
//Concrete Class extending the LivingThing class.
public class Human extends LivingThing{
    //Constructor for the Human class which accept the parameter.
    public Human (String name){
        super(name);
    }
    @Override
    //Overriding the walk method in the child concrete class.
    public void walk(){
        System.out.println("Human "+this.getName()+ " walks...");
    }
}
