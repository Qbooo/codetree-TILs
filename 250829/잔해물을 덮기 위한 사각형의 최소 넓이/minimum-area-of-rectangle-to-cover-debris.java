import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rect1_x1 = sc.nextInt();
        int rect1_y1 = sc.nextInt();
        int rect1_x2 = sc.nextInt();
        int rect1_y2 = sc.nextInt();
        int rect2_x1 = sc.nextInt();
        int rect2_y1 = sc.nextInt();
        int rect2_x2 = sc.nextInt();
        int rect2_y2 = sc.nextInt();
        // Please write your code here.

        int[][] sq = new int[2001][2001];
        if((rect2_x1 > rect1_x1 && rect2_x1 < rect1_x2) && (rect2_x2 > rect1_x1 && rect2_x2 < rect1_x2)
        && (rect2_y1 < rect1_y1 && rect2_y2 > rect1_y2)){
            System.out.print((rect1_x2-rect1_x1) * (rect1_y2-rect1_y1));
            
        }else if((rect2_y1 > rect1_y1 && rect2_y1 < rect1_y2) && (rect2_y2 > rect1_y1 && rect2_y2 < rect1_y2)
        && (rect2_x1 < rect1_x1 && rect2_x2 > rect1_x2)){
            System.out.print((rect1_x2-rect1_x1) * (rect1_y2-rect1_y1));
        }else if((rect2_x1 < rect1_x1 && rect2_y1 < rect1_y1) && (rect2_x2 > rect1_x2 && rect2_y2 > rect1_y2)){
            System.out.print("0");
        }
        else{
            for(int i = rect1_x1 + 1000; i < rect1_x2 + 1000; i++){
            for(int j = rect1_y1 + 1000;  j < rect1_y2 + 1000; j++){
                sq[i][j] = 1;
            }
        }
        for(int i = rect2_x1 + 1000; i < rect2_x2 + 1000; i++){
            for(int j = rect2_y1 + 1000;  j < rect2_y2 + 1000; j++){
                sq[i][j] = 0;
            }
        }
        int vMax = 0;
        int hMax = 0;
        for(int i = 0; i < 2001; i++){
            int hCnt = 0;
            int vCnt = 0;
            for(int j = 1; j < 2001; j++){
                if(sq[i][j-1] == 1 && sq[i][j] == 1){
                    hCnt++;
                }
                if(sq[j-1][i] == 1 && sq[j][i] == 1){
                    vCnt++;
                }
            }
            if(hMax < hCnt){
                hMax = hCnt;
            }
            if(vMax < vCnt){
                vMax = vCnt;
            }
        }

        System.out.print((hMax+1)*(vMax+1));
        }
        

    }
}