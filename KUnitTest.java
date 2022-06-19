package Reflection;
import static Reflection.KUnit.*;
/*
 * @author Sachintha Ashika Bandara Yapa
 */
public class KUnitTest {
	
	void checkConstructorAndAccess() {
		Square s = new Square (20, 20);
		checkEquals(s.getLength(),20);
		checkEquals(s.getWidth(),20);
		checkNotEquals(s.getLength(),10);
		checkNotEquals(s.getWidth(),10);
	}

	void checkgetArea() {
		Square s=new Square(20,20);
		s.getArea();
		checkEquals(s.getArea(),400);	
		checkNotEquals(s.getArea(),100);
	}
	
	public static void main(String[] args) {
		KUnitTest ts=new KUnitTest();
		ts.checkConstructorAndAccess();
		ts.checkgetArea();
		report();	
	}
}
