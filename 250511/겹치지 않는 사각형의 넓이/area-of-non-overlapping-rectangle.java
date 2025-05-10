import java.util.Scanner;
public class Main {
    public static final int Max = 2001;
    public static int[][] checked = new int[Max][Max];
    public static int count = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ax1 = sc.nextInt();
        int ay1 = sc.nextInt();
        int ax2 = sc.nextInt();
        int ay2 = sc.nextInt();
        int bx1 = sc.nextInt();
        int by1 = sc.nextInt();
        int bx2 = sc.nextInt();
        int by2 = sc.nextInt();
        int mx1 = sc.nextInt();
        int my1 = sc.nextInt();
        int mx2 = sc.nextInt();
        int my2 = sc.nextInt();
        // Please write your code here.
        for(int i = ax1; i <ax2; i++){
            for(int j = ay1; j < ay2; j++){
                checked[i][j] = 1;
            }
        }
        for(int i = bx1; i <bx2; i++){
            for(int j = by1; j < by2; j++){
                checked[i][j] = 1;
            }
        }
        for(int i = mx1; i <mx2; i++){
            for(int j = my1; j < my2; j++){
                checked[i][j] = 0;
            }
        }
        
        int minX = Math.min(ax1, Math.min(bx1, mx1));
        int maxX = Math.max(ax2, Math.max(bx2, mx2));
        int minY = Math.min(ay1, Math.min(by1, my1));
        int maxY = Math.max(ay2, Math.max(by2, my2));

        for(int i = minX; i < maxX; i++) {
            for(int j = minY; j < maxY; j++) {
                if(checked[i][j] == 1) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}