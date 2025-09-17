import java.util.Scanner;
public class Main {
    public static int size(int maxX, int maxY, int minX, int minY){
        return (maxX - minX) * (maxY - minY);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] x = new int[N];
        int[] y = new int[N];
        for (int i = 0; i < N; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }
        // Please write your code here.
        int minSize = Integer.MAX_VALUE;

        for(int i = 0; i < N; i++){
            int size = 0;
            int maxX = 0;
            int maxY = 0;
            int minX = Integer.MAX_VALUE;
            int minY = Integer.MAX_VALUE;
            for(int j = 0; j < N; j++){
                if(i == j)continue;
                maxX = Math.max(maxX, x[j]);
                maxY = Math.max(maxY, y[j]);
                minX = Math.min(minX, x[j]);
                minY = Math.min(minY, y[j]);

            }
            size = size(maxX, maxY, minX, minY);
            minSize = Math.min(minSize, size);
        }
        System.out.print(minSize);

    }
}