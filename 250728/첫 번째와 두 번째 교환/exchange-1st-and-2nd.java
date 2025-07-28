import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner s = new Scanner(System.in);
        String w = s.next();
        char w1 = w.charAt(0);
        char w2 = w.charAt(1);

        String ww = "";

        for(int i = 0; i < w.length(); i++){
            if(w.charAt(i) == w1){
                ww = ww + w2;
            }else if(w.charAt(i) == w2){
                ww = ww + w1;
            }else{
                ww = ww + w.charAt(i);
            }
        }

        System.out.print(ww);
    }
}