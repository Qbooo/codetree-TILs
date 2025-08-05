import java.util.*;
public class Main {
    public static int pac(int n){
        if(n == 1){
            return 1;
        }
        return pac(n-1) * n;
    }
    public static void main(String[] args) {
        // Please write your code here.
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.print(pac(n));

    }
}