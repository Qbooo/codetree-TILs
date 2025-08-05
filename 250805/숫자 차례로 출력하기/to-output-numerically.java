import java.util.Scanner;

public class Main {
    // 1부터 n까지 오름차순 출력
    public static void printAsc(int i, int n) {
        if (i > n) return;
        System.out.print(i + " ");
        printAsc(i + 1, n);
    }

    // n부터 1까지 내림차순 출력
    public static void printDesc(int n) {
        if (n == 0) return;
        System.out.print(n + " ");
        printDesc(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        printAsc(1, n);  // 오름차순
        System.out.println();
        printDesc(n);    // 내림차순
    }
}
