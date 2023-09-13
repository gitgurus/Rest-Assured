package JavaPrograms.FAQs;

import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args){

        System.out.println("Please enter a number to reverse");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int actualNum = num;
        int rev = 0;

        while(num!=0){
            rev = rev*10 + num%10;
            num = num/10;
        }
        System.out.println(rev);

        if(actualNum == rev){
            System.out.println("Given number is a Palindrome");
        }
        else System.out.println("Given number is not a Palindrome");

        /*int num1= 26789;
        StringBuffer sb = new StringBuffer(String.valueOf(num1));
        StringBuffer rev1 = sb.reverse();
        System.out.println("Reverse number is : " +rev1);

        StringBuilder s = new StringBuilder();
        s.append(num1);
        System.out.println(s.reverse());
*/
    }
}
