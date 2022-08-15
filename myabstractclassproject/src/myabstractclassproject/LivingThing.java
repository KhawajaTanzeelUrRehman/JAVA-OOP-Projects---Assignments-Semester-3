package myabstractclassproject;
//Creating an abstract class according to the given uml.
public abstract class LivingThing {
    //Instant variable to store name of the livingThing.
    private String name;
    //Constructor which accept a parameter.
    public LivingThing(String name){
        //Assigning the name which will be received in the parameter.
        this.name = name;
    }
    //Method to breath for the LivingThing.
    public void breath(){

    }
    //Method to eat for the LivingThing.
    public void eat(){

    }
    //Abstract method to walk for the LivingThing.
    public abstract void walk();
    //Getter method to get the name of the LivingThing
    public String getName(){
        return this.name;
    }
    //Setter method to set the name of the LivingThing.
    public void setName(String name) {
        this.name = name;
    }
}
