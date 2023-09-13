package JavaPrograms.FAQs;

public class RemovingNumbersInString {

    public static void main(String[] args){

        String str = "1995gurunath3101";
        String original_str = str;
        String rev = "";
        for(int i = str.length()-1; i >= 0; i--){

            if(str.charAt(i) >= 97 && str.charAt(i) <= 122) {
                rev = rev + str.charAt(i);
            }
        }

        System.out.println(original_str);
        System.out.println(rev);

    }
}
