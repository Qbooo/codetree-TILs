import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner s = new Scanner(System.in);

        String w = s.nextLine();

        for(int i = 0; i < w.length(); i++){
            if(w.charAt(i) == 'e'){
                w = w.substring(0,i)+w.substring(i+1,w.length());
                break;
            }
        }

        System.out.print(w);

    }
}