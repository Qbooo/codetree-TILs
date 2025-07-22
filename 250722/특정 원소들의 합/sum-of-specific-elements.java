import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner s = new Scanner(System.in);

        int[][] num = new int[4][4];

        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                num[i][j] = s.nextInt();
            }
        }

        int sum = 0;
        for(int i = 0; i < 4; i++){
            for(int j = i; j < 4; j++){
                sum += num[j][i];
            }
        }

        System.out.print(sum);
    }
}