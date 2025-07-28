import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner s = new Scanner(System.in);

        String words = s.nextLine();
        String ee = "No";
        String ab = "No";

        for(int i = 0; i < words.length() - 1; i++){
            if(words.substring(i, i+2).equals("ee")){
                ee = "Yes";
            }
            if(words.substring(i, i+2).equals("ab")){
                ab = "Yes";
            }
        }

        System.out.println(ee+" "+ab);

    }
}