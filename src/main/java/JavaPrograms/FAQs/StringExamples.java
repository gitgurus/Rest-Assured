package JavaPrograms.FAQs;

public class StringExamples {

    public static void main(String[] args) {

        String str = "engineering";

        String[] arr = str.split("");


        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i].equals(arr[j])) {
                    count++;
                   arr[j]="0";
                }
            }

           /* if(count > 1 && arr[i]!="0"){
                System.out.println(arr[i]);
            }*/

            if(count==1 && arr[i]!="0"){
                System.out.println(arr[i]);
            }
        }
    }
}
