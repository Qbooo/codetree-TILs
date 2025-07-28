import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner s = new Scanner(System.in);

        String w = s.nextLine();
        String rl = s.nextLine();

        for(int i = 0; i < rl.length(); i++){
            if(rl.charAt(i) == 'R'){
                w = w.charAt(w.length()-1) + w.substring(0,w.length()-1);
            }else if(rl.charAt(i) == 'L'){
                w = w.substring(1,w.length()) + w.charAt(0);
            }
        }
        System.out.println(w);
    }
}