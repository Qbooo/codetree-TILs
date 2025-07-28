import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner s = new Scanner(System.in);

        String a = s.nextLine();
        String b = s.nextLine();
        int cnt = 0;

        for(int i = 0; i < a.length() - b.length() + 1; i++){
            if(a.substring(i,i+b.length()).equals(b)){
                cnt++;
            }
        }

        System.out.print(cnt);
    }
}