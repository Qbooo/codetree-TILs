import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner s = new Scanner(System.in);

        String[] words = new String[10];

        boolean aa = false;

        for(int i = 0; i < 10; i++){
            words[i] = s.nextLine();
        }

        char w = s.next().charAt(0);

        for(int i = 0; i < 10; i++){
            if(words[i].charAt(words[i].length() - 1) == w){
                System.out.println(words[i]);
                aa = true;
            }
        }

        if(aa != true){
            System.out.println("None");
        }

    }
}