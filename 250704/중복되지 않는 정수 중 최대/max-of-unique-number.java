import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        Map<Integer, Integer> map = new HashMap<>();
        int max = -1;

        // 입력받으며 빈도수 저장
        for (int i = 0; i < n; i++) {
            int num = s.nextInt();
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // map 순회하며, 중복되지 않은 수 중 최대값 찾기
        for (int key : map.keySet()) {
            if (map.get(key) == 1 && key > max) {
                max = key;
            }
        }

        System.out.println(max);
    }
}
