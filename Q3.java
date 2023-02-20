//3. WAP to reverse a sentence while preserving the position
//Input = Think Twice
//Output = kniht eciwt”
public class Q3 {



        public static void main(String[] args) {
            String str1 = "Think Twice";
            String str2 = "";

            str1 = str1.toLowerCase();
            String arr[] = str1.split(" ");

            for(String elem : arr)
            {
                for(int i=elem.length()-1 ; i>=0 ; i--)
                {
                    str2 = str2 + elem.charAt(i);
                }
                str2 = str2 + " ";
            }

            System.out.println("After traversing: "+str2);


    }
}
