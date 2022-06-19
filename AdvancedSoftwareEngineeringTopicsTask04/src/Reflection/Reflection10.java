package Reflection;
/*
 * @author Sachintha Ashika Bandara Yapa
 */
import java.lang.reflect.*;

public class Reflection10 {
 public static void main(String[] args) throws Exception {
 Square s = new Square(20,20);
 Method m = s.getClass().getDeclaredMethod("setLength", int.class);
 m.setAccessible(true);
 m.invoke(s, 80);
 System.out.println(s);
 }
}
