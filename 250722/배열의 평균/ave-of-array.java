import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.

        Scanner s = new Scanner(System.in);

        int[][] num = new int[2][4];

        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 4; j++){
                num[i][j] = s.nextInt();
            }
        }
       
        for(int i = 0; i < 2; i++){
            double avg1 = 0;
            for(int j = 0; j < 4; j++){
                avg1 += num[i][j];
               
            }
             System.out.printf("%.1f ", avg1/4);
        }
        System.out.println();
        
        for(int i = 0; i < 4; i++){
            double avg2 = 0;
            for(int j = 0; j < 2; j++){
                avg2 += num[j][i];
                
            }
            System.out.printf("%.1f ", avg2/2);
        }
        System.out.println();
        
        double avg3 = 0;
        for(int i = 0; i < 4; i++){
            
            for(int j = 0; j < 2; j++){
                avg3 += num[j][i];
            }
        }
        System.out.printf("%.1f", avg3/8);

    }
}