import java.util.*;

class Man {
    int k;
    int num;
    boolean sick = false;

    public Man(int k, int num) {
        this.k = k;
        this.num = num;
    }
}

public class Main {
    static Man[] a;

    public static void shackhand(int x, int y) {
        if (a[x-1].sick) {
            if (a[x-1].k > 0) {
                a[x-1].k--;
                a[y-1].sick = true;
            }
        }
        if (a[y-1].sick) {
            if (a[y-1].k > 0) {
                a[y-1].k--;
                a[x-1].sick = true;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int P = sc.nextInt();
        int T = sc.nextInt();
        int[][] shakes = new int[T][3];
        for (int i = 0; i < T; i++) {
            shakes[i][0] = sc.nextInt(); // 시간
            shakes[i][1] = sc.nextInt(); // x
            shakes[i][2] = sc.nextInt(); // y
        }

        // 시간순 정렬
        Arrays.sort(shakes, Comparator.comparingInt(o -> o[0]));

        a = new Man[N];
        for (int i = 0; i < N; i++) {
            a[i] = new Man(K, i + 1);
        }
        a[P-1].sick = true;

        for (int i = 0; i < T; i++) {
            int x = shakes[i][1];
            int y = shakes[i][2];
            shackhand(x, y);
        }

        for (int i = 0; i < N; i++) {
            System.out.print(a[i].sick ? 1 : 0);
        }
    }
}
