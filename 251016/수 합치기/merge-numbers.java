import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        PriorityQueue<Long> pq = new PriorityQueue<>(); // 최소 힙
        for (int i = 0; i < n; i++) {
            pq.add((long) sc.nextInt()); // 입력을 long으로 변환
        }
        
        long totalCost = 0;
        while (pq.size() > 1) { // 1개 남을 때까지
            long a = pq.poll(); // 가장 작은 수
            long b = pq.poll(); // 다음 작은 수
            long sum = a + b;
            totalCost += sum;   // 비용 누적
            pq.add(sum);        // 합친 값 다시 넣기
        }
        
        System.out.println(totalCost);
    }
}