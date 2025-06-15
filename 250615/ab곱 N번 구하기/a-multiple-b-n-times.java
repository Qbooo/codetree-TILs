import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int mul = 1;

        for(int i = 0; i < n; i++){
            int a = s.nextInt();
            int b = s.nextInt();
            mul = 1;
            for(int j = a; j <= b; j++){
                mul = mul * j;
            }
            System.out.println(mul);

        }
    }
}