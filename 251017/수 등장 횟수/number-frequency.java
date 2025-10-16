import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int N = Integer.parseInt(br.readLine());
        
        // 1. HashMap에 각 수의 등장 횟수 저장
        HashMap<Integer, Integer> countMap = new HashMap<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
            
            // 방법 1: getOrDefault 사용
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
            
            // 방법 2: compute 사용 (대안)
            // countMap.compute(num, (k, v) -> v == null ? 1 : v + 1);
        }
        
        // 2. M개의 수에 대해 등장 횟수 조회
        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        
        for (int i = 0; i < M; i++) {
            int query = Integer.parseInt(st.nextToken());
            
            // HashMap에서 조회, 없으면 0 반환
            sb.append(countMap.getOrDefault(query, 0)).append(" ");
        }
        
        System.out.println(sb);
    }
}