import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner s = new Scanner(System.in);

        String tnt = "";

        int n = s.nextInt();
        s.nextLine();

        for(int i = 0; i < n; i++){
            String w = s.nextLine();
            tnt += w;
        }

        System.out.println(tnt);

    }
}