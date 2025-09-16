import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        long total = 1L * N * N * N;

        int countA = Math.max(0, Math.min(N, a + 2) - Math.max(1, a - 2) + 1);
        int countB = Math.max(0, Math.min(N, b + 2) - Math.max(1, b - 2) + 1);
        int countC = Math.max(0, Math.min(N, c + 2) - Math.max(1, c - 2) + 1);

        long none = 1L * (N - countA) * (N - countB) * (N - countC);
        long answer = total - none;

        System.out.println(answer);
    }
}
