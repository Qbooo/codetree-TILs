import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner s = new Scanner(System.in);

        String[] words = new String[4];

        for(int i = 0; i < 4; i++){
            words[i] = s.nextLine();
        }

        for(int i = 3; i >= 0; i--){
            System.out.println(words[i]);
        }

    }
}