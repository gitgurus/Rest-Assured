package JavaPrograms.FAQs;

import java.util.Scanner;

public class StringReverse {

    public static void main(String[] args){
        System.out.println("Please enter a string to reverse");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String original_str= str;
        String rev ="";
        for(int i = str.length()-1;i>=0;i--){
           rev= rev + str.charAt(i);
        }
        System.out.println(original_str);
        System.out.println(rev);

        if(original_str.equals(rev)){
            System.out.println("Given String is a Palindrome");
        }
        else
        {
            System.out.println("Given String is not a Palindrome");
        }

        // char[] a = str1.toCharArray();
    }
}
