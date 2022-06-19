package Reflection;

/*
 * explores the Reflection API.
 * It demonstrates how to find out which class an object is an instance of.
 * getClass returns an object belonging to the class called Class.
 * The getName method of the Class object is called to find out just the class
 *
 * @author Sachintha Ashika Bandara Yapa
 */
public class Reflection03 {

  public static void main(String[] args) {
	Square s = new Square(20,20);
    System.out.println("class =" + s.getClass());
    System.out.println("class name =" + s.getClass().getName());
}
}

