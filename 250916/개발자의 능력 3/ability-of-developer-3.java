import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ability = new int[6];
        int total = 0;
        for (int i = 0; i < 6; i++) {
            ability[i] = sc.nextInt();
            total += ability[i];
        }

        int min = Integer.MAX_VALUE;

        // 6명 중 3명 고르기
        for (int i = 0; i < 4; i++) {
            for (int j = i + 1; j < 5; j++) {
                for (int k = j + 1; k < 6; k++) {
                    int teamA = ability[i] + ability[j] + ability[k];
                    int teamB = total - teamA;
                    int diff = Math.abs(teamA - teamB);
                    min = Math.min(min, diff);
                }
            }
        }

        System.out.println(min);
    }
}
