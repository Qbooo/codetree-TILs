import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                System.out.println(i+" * "+j+" = "+i*j);
            }
        }

    }
}