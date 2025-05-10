import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] x1 = new int[201];
        int[] y1 = new int[201];
        int[] x2 = new int[201];
        int[] y2 = new int[201];
        int[][] checked = new int [201][201];
        for(int i = 0; i < N; i++){
            x1[i] = sc.nextInt();
            y1[i] = sc.nextInt();
            x2[i] = sc.nextInt();
            y2[i] = sc.nextInt();

            for(int j = x1[i]; j < x2[i]; j++){
                for(int m = y1[i]; m < y2[i]; m++){
                    checked[j][m]++;
                }
            }

        }
        int size = 0;
        for(int i = 0; i < 201; i++){
            for(int j = 0; j < 201; j++){
                if(checked[i][j] > 0){
                    size++;
                }
            }
        }
        System.out.println(size);
    }
}