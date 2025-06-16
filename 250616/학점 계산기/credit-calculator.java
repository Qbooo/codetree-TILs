import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        double[] score = new double[n];
        for (int i = 0; i < n; i++) {
            score[i] = s.nextDouble();
        }

        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += score[i];
        }

        double avg = sum / n;
        System.out.printf("%.1f\n", avg); // 소수점 첫째 자리까지 출력

        if (avg >= 4.0) {
            System.out.println("Perfect");
        } else if (avg >= 3.0) {
            System.out.println("Good");
        } else {
            System.out.println("Poor");
        }
    }
}
