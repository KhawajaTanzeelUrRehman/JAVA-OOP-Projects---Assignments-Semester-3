package myabstractclassproject;
//Concrete Class extending the LivingThing class.
public class Monkey extends LivingThing{
    //Constructor for the Monkey class which accept the parameter.
    public Monkey (String name){
        super(name);
    }
    @Override
    //Overriding the walk method in the child concrete class.
    public void walk(){
        System.out.println("Monkey "+this.getName()+" also walks...");
    }
}
