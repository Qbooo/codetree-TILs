import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] arr = new String[200];
        int count = 0;

        while (true) {
            String input = s.nextLine();
            if (input.equals("0")) break;
            arr[count] = input;
            count++;
        }

        // 총 입력 개수 출력
        System.out.println(count);

        // 홀수번째로 입력된 문자열만 출력 (1-based 기준 → index 0, 2, 4, ...)
        for (int i = 0; i < count; i++) {
            if (i % 2 == 0) {
                System.out.println(arr[i]);
            }
        }
    }
}
