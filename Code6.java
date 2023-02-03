package week2;
import java.util.*;


public class Code6 {
public static void main(String  []args) {
	  Vector vec = new Vector();
      vec.add("Austin");
      vec.add("Denver");
      vec.add("Chicago");

      Iterator pointer = vec.iterator();
      while (pointer.hasNext()) {
          System.out.println(pointer.next());
}
}}
