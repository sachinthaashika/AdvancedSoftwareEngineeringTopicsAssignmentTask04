package Reflection;
/*
 * @author Sachintha Ashika Bandara Yapa
 */
import java.lang.reflect.Field;

/*
 * The accessibility flags for both the public and private member are set to
 * false
 */

public class Reflection06 {

  public static void main(String[] args) throws Exception{
    Square s = new Square(20,20);
    
    Field[] fields = s.getClass().getDeclaredFields();
    System.out.printf("There are %d fields\n", fields.length);
    
    for(Field f : fields) {
      System.out.printf("field name=%s type=%s accessible=%s\n",
        f.getName(), f.getType(), f.isAccessible());
    } 
  }
}
