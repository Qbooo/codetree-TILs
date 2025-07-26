import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.

        Scanner s = new Scanner(System.in);
        String w = s.nextLine();

        char a = s.next().charAt(0);
        int cnt = 0;

        for(int i = 0; i < w.length(); i++){
            if(w.charAt(i) == a){
                cnt++;
            }
        }
        System.out.println(cnt);

    }
}