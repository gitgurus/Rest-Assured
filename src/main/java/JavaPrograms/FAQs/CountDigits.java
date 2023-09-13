package JavaPrograms.FAQs;

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args){


        int num = 43645343;
        int count=0;

        while(num>0){
            num=num/10;
            count++;
        }

        System.out.println("Number of digits in given number is :" +count);

    }

}
