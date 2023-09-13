package JavaPrograms.FAQs;

public class Factorial {

    public static void main(String[] args) {
        int num = 6;
        long fact = 1;

        for(int i =num ; i >= 1 ; i--){
            fact = fact * i;
        }
        System.out.println("Factorial of a number is : " +fact);
    }
}
