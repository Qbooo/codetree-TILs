import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++)
            A[i] = sc.nextInt();
        int[] B = new int[M];
        for (int i = 0; i < M; i++)
            B[i] = sc.nextInt();

        int cnt = 0;

        for (int i = 0; i <= N - M; i++) {
            int[] used = new int[M]; // B의 각 값 사용 여부
            int match = 0;

            for (int j = i; j < i + M; j++) {
                for (int k = 0; k < M; k++) {
                    if (A[j] == B[k] && used[k] == 0) {
                        used[k] = 1; // 이 B[k]는 사용됨
                        match++;
                        break; // A[j] 하나는 한 번만 매칭
                    }
                }
            }

            if (match == M) cnt++;
        }

        System.out.println(cnt);
    }
}
