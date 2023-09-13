package JavaPrograms.FAQs;

public class ReverseWordsInString {
    public static void main(String[] args) {

        String str = "Hi Guru Welcome to Bangalore";
        String[] str1 = str.split(" ");

        String rev = "";

        System.out.println("Number of words in String are : " +str1.length);
        for(int i=0; i < str1.length ; i++){
            for(int j=str1[i].length()-1;j>=0;j--){
                //System.out.print(str1[i].charAt(j));
                rev = rev + str1[i].charAt(j);
            }
           // System.out.print(" ");
            rev = rev + " ";
        }

        System.out.println(rev);
    }
}
