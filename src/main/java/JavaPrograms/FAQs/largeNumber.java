package JavaPrograms.FAQs;

public class largeNumber {

    public static void main(String[] args) {

        int a= 46;
        int b = 47;
        int c = 48;

        int large = a>b?a:b;

        int largest = c>large?c:large;
        System.out.println("Largest number is : " +largest);

    }
}
