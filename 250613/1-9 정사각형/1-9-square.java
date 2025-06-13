import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int cnt = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print(num[cnt%9]);
                cnt++;
            }
            System.out.println();
        }
    }
}