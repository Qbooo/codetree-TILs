import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.

        Scanner s = new Scanner(System.in);

        boolean ex = false;

        String w = s.next();
        char ww = s.next().charAt(0);

        for(int i = 0; i < w.length(); i++){
            if(w.charAt(i) == ww){
                System.out.print(i);
                ex = true;
                break;
            }
        }
        if(ex == false){
            System.out.print("No");
        }

    }
}