import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.

        Scanner s =new Scanner(System.in);
        int n = s.nextInt();
        int[] num = new int[n];

        for(int i = 0; i < n; i++){
            num[i] = s.nextInt();
            num[i] = num[i] * num[i];
        }

        for(int i = 0; i < n; i++){
            System.out.print(num[i]+" ");
        }

    }
}