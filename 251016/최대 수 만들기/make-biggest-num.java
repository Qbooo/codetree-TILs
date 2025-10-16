import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] arr = new Integer[n]; // Integer로 사용 (primitive int 대신)
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // 커스텀 컴패레이터로 정렬
        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                String ab = a + "" + b; // a + b
                String ba = b + "" + a; // b + a
                return ba.compareTo(ab); // ba가 더 크면 음수, ab가 더 크면 양수
            }
        });

        // 정렬된 수를 문자열로 결합
        StringBuilder result = new StringBuilder();
        for (int num : arr) {
            result.append(num);
        }

        // 결과 출력 (0으로 시작하거나 빈 문자열 방지)
        String answer = result.toString();
        if (answer.charAt(0) == '0' || answer.isEmpty()) {
            System.out.println(0);
        } else {
            System.out.println(answer);
        }
    }
}