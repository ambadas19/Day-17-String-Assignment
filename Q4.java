//4. Write a program to sort a String Alphabetically

import java.util.*;
import java.util.Arrays;
public class Q4 {

    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);

        System.out.println("Enter String: ");
        String str = obj.nextLine();

        char ch[] = str.toCharArray(); //Convert String into Character array
        Arrays.sort(ch);
        System.out.println(ch);


    }
}
