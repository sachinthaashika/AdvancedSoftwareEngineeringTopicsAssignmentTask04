package Reflection;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
/*
 * @author Sachintha Ashika Bandara Yapa
 */
public class SquareTest {
	
	@Test
	public void testLength() {
		Square r = new Square(20,20);	
		assertEquals(20,r.getLength());
	}
	
	@Test
	public void testWidth() {
		Square r = new Square(20,20);	
		assertEquals(20,r.getWidth());
	}
	
	@Test
	public void testArea() {
		Square r = new Square(20,20);
		assertEquals(400,r.getArea());
	}
}




