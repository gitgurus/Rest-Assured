package JavaPrograms.FAQs;

public class PrimeNumber {

    public static void main(String[] args) {

        int num = 99;
        int count = 0;

        if(num>0){

            for(int i =1; i<=num; i++){
                if(num%i == 0){
                    count++;
                }
            }
            if(count==2){
                System.out.println("Given number is a prime number");
            }
            else
            {
                System.out.println("Given number is not a prime number");
            }
        }
        else System.out.println("Please enter valid number");
    }
    }
