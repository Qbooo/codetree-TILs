import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = 1; i <= 2 * N; i++) {
            int starCount;

            if (i == 1 || i == 2 * N) {
                starCount = N;
            } else if (i == 2 || i == 2 * N - 1) {
                starCount = 1;
            } else if (i <= N) {
                starCount = N - (i - 1);
            } else {
                starCount = i - N;
            }

            printStars(starCount);
        }

        sc.close();
    }

    private static void printStars(int count) {
        for (int j = 0; j < count; j++) {
            System.out.print("*");
            if (j != count - 1) System.out.print(" ");
        }
        System.out.println();
    }
}
