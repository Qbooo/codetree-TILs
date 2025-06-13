import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int cnt = 0;
        int[] num = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print(num[cnt%9]);
                cnt++;
            }
            System.out.println();
        }
    }
}