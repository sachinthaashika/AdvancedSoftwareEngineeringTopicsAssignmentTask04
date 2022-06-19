package Reflection;
/*
 * @author Sachintha Ashika Bandara Yapa
 */
import java.lang.reflect.Field;

/*
 * this time a reference to the b field is obtained, but when it is used, a runtime
 * exception is thrown that clearly states that members with private modifiers
 * cannot be accessed. Again data integrity stands firm.
 * 
 *  @author Sachintha Ashika Bandara Yapa
 */

public class Reflection05 {

  public static void main(String[] args) throws Exception{
    Square s = new Square(20,20);
    
    //use .getDeclaredFields() instead of .getFields() 
    
    Field [] fields =  s.getClass().getDeclaredFields();
    System.out.printf("There are %d fields\n",  fields.length);
    
    for(Field f : fields) {
      System.out.printf("field name=%s type=%s value=%d\n", f.getName(), f.getType(), f.getShort(s));
      
    }
  }
}
   