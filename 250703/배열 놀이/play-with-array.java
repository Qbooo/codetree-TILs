import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int q = s.nextInt();

        int[] num = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = s.nextInt();
        }

        for (int i = 0; i < q; i++) {
            String command = s.next(); // "1", "2", or "3"

            if (command.equals("1")) {
                int a = s.nextInt();
                System.out.println(num[a - 1]);
            } else if (command.equals("2")) {
                int b = s.nextInt();
                int answer = 0;
                for (int j = 0; j < n; j++) {
                    if (num[j] == b) {
                        answer = j + 1; // 문제 요구는 index가 아니라 위치(1-based)
                        break;
                    }
                }
                System.out.println(answer);
            } else if (command.equals("3")) {
                int sIdx = s.nextInt();
                int eIdx = s.nextInt();
                for (int j = sIdx - 1; j < eIdx; j++) {
                    System.out.print(num[j]);
                    if (j < eIdx - 1) System.out.print(" ");
                }
                System.out.println();
            }
        }
    }
}
