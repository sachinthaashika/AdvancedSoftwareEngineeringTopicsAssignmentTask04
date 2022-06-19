package Reflection;
/*
 * @author Sachintha Ashika Bandara Yapa
 */
public class Reflection02 {
  public static void main(String[] args) {
    Square s = new Square(20,20);
    s.setLength(30);
    
  // s.squareB(); //if you uncomment this you will get a complier error
    short l = s.getLength();
    
  
  // long b = s.b; //if you uncomment this you will get a complier error
    System.out.println("s=" + s);
  }
}

