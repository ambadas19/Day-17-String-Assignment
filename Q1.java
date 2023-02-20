/*1. What is Mutable String in Java Explain with an example
Ans = a) Mutable String is a type of String in which String object (data) can be changed and changes are
         reflected in the same String object there is no creation of new String object.

      b) If String Object (data) frequently changes it is recommended to use Mutable String because
          if we use immutable String for every change there is creation of new String Object.

      c) Mutable String = StringBuffer and StringBuilder .

 */
public class Q1 {

    public static void main(String[] args) {

        //Mutable String
        StringBuilder str = new StringBuilder("Physics");
        str.append(" Wallah"); //str + "Wallah"
        System.out.println(str);

        //Mutable String
        StringBuffer str2 = new StringBuffer("Virat");
        str2.append(" Kohli");
        System.out.println(str2);


    }
}
