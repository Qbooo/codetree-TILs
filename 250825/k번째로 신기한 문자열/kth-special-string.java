import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String t = sc.next();
        String[] words = new String[n];
        for (int i = 0; i < n; i++) {
            words[i] = sc.next();
        }
        // Please write your code here.
        String[] aa = new String[n];
        Arrays.sort(words);
        int x = 0;
        int m = t.length();

        for(int i = 0; i < n; i++){
            if(words[i].substring(0, m).equals(t)){
                aa[x] = words[i];
                x++;
            }
        }

        System.out.print(aa[k-1]);

    }
}