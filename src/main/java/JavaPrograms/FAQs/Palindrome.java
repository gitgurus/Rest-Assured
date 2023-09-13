package JavaPrograms.FAQs;

public class Palindrome {

    public static void main (String[] args) {
        String str = "radar";
        String original_str = str;
        String rev = "";
        for(int i = str.length()-1; i >= 0; i--){
            rev = rev + str.charAt(i);
        }

        System.out.println(original_str);
        System.out.println(rev);

        if(original_str.equals(rev)){
            System.out.println("Given string " +str+ " is a palindrome" );
        }
    }
}
