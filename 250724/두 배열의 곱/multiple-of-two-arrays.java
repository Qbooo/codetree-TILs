import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner s = new Scanner(System.in);

        int[][] a = new int[3][3];
        int[][] b = new int[3][3];

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                a[i][j] = s.nextInt();
            }
        }

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                b[i][j] = s.nextInt();
            }
        }

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.print(a[i][j]*b[i][j]+" ");
            }
            System.out.println();
        }

    }
}