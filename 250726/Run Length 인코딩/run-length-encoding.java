import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String line = s.nextLine();

        StringBuilder sb = new StringBuilder();
        char prev = line.charAt(0);
        int count = 1;

        for (int i = 1; i < line.length(); i++) {
            char curr = line.charAt(i);
            if (curr == prev) {
                count++;
            } else {
                sb.append(prev).append(count);
                prev = curr;
                count = 1;
            }
        }

        sb.append(prev).append(count); // 마지막 문자 처리

        System.out.println(sb.length());  // 압축된 문자열 길이
        System.out.println(sb.toString());  // 압축된 문자열 출력
    }
}
