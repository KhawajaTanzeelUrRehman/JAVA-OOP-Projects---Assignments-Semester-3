public class Circle {
    private double radius;
    public Circle(double radius){
        this.radius=radius;
    }
    public Circle(){
       this(10.0); 
    }
    
    public void display(){
    System.out.println(radius); 
    }
  public static void main(String[] args) {
      Circle c1=new Circle();
      c1.display();
  
  } 
}
