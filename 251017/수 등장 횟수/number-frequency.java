import java.util.*;
public class Main {
    public static HashMap<Integer, Integer> map = new HashMap<>();  // m → map으로 변경
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();  // 이 변수명은 그대로 사용 (지역변수)
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] queries = new int[m];
        for (int i = 0; i < m; i++) {
            queries[i] = sc.nextInt();
        }
        
        // 1. arr의 각 수의 등장 횟수를 HashMap에 저장
        for (int i = 0; i < n; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        
        // 2. 각 쿼리에 대해 등장 횟수 출력
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < m; i++) {
            sb.append(map.getOrDefault(queries[i], 0)).append(" ");
        }
        
        System.out.println(sb.toString().trim());
    }
}