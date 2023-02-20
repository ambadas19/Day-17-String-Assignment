//2. Write a program to reverse a String
// Input : "PWSKILLS"
//OUTPUT : "SLLIKSWP"

import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {

      Scanner obj = new Scanner(System.in);
      System.out.println("Enter String : "); //PWSKILLS
      String in = obj.nextLine();

      //with the help of reverse()
      StringBuilder str = new StringBuilder(in);
      str.reverse();
      System.out.println(str); //SLLIKSWP


    }
}
