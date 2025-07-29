import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        String a = s.next();
        s.nextLine();
        int cnt = 0;

        for(int i = 0; i < n; i++){
            String w = s.nextLine();
            if(w.equals(a)){
                cnt++;
            }
        }
        System.out.print(cnt);

    }
}