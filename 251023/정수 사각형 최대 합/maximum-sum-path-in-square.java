import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] maxNum = new int[n][n];
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        // Please write your code here.
        maxNum[0][0] = matrix[0][0];
        for(int i = 1; i < n; i++){
            maxNum[0][i] = matrix[0][i] + maxNum[0][i-1];
        }
        for(int i = 1; i < n; i++){
            maxNum[i][0] = matrix[i][0] + maxNum[i-1][0];
        }

        for(int i = 1; i < n; i++){
            for(int j = 1; j < n; j++){
                maxNum[i][j] = Math.max(matrix[i][j]+maxNum[i-1][j], matrix[i][j]+maxNum[i][j-1]);
            }
        }

        int max = 0;

        for(int i = 0; i < n; i++){
            max = Math.max(max, maxNum[n-1][i]);
        }


        // for(int i = 0; i < n; i++){
        //     for(int j = 0; j < n; j++){
        //         System.out.print(maxNum[i][j]+" ");
        //     }
        //     System.out.println();
        // }
        System.out.print(max);
    }
}