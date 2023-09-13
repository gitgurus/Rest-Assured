package JavaPrograms.FAQs;

public class BiggerAndSmallerInArray {

    public static void main(String[] args) {
        int a[] = {50,11,55,88,12};
        int max = a[0];
        int min = a[0];
       /* for(int i =1; i<a.length; i++){
            if(a[i]>max){
                max = a[i];
            }
        }
        System.out.println("Maximum number in array is: " +max);*/

        for(int i = 1; i<a.length; i++){
            if(a[i]<min){
                min = a[i];
            }
        }
        System.out.println("Maximum number in array is: " +min);

    }
}
