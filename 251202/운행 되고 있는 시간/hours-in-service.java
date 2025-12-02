import java.util.*;

class Event implements Comparable<Event> {
    int time;
    int type;   // 0: 시작, 1: 끝
    int idx;    // 직원 번호 (-1이면 전체 이벤트)

    Event(int time, int type, int idx) {
        this.time = time;
        this.type = type;
        this.idx = idx;
    }

    @Override
    public int compareTo(Event o) {
        if (this.time != o.time) return Integer.compare(this.time, o.time);
        // 같은 시간이면 시작(0)이 끝(1)보다 먼저 와야 함
        return Integer.compare(this.type, o.type);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] intervals = new int[N][2];
        List<Event> events = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            intervals[i][0] = a;
            intervals[i][1] = b;
            events.add(new Event(a, 0, i));  // 시작
            events.add(new Event(b, 1, i));  // 끝
        }

        Collections.sort(events);

        // 1. 전체 union 길이 계산 + 각 시간대에 몇 명이 일하는지 기록
        int[] cover = new int[1001];  // cover[t] = t시각에 일하는 사람 수
        int active = 0;
        int prev = -1;
        int totalUnion = 0;

        for (Event e : events) {
            if (prev != -1 && e.time != prev && active > 0) {
                totalUnion += e.time - prev;
                for (int t = prev; t < e.time; t++) {
                    cover[t] = active;
                }
            }
            if (e.type == 0) active++;
            else active--;
            prev = e.time;
        }

        // 2. 각 직원 i를 제외했을 때 사라지는 길이 = i가 단독으로 커버한 구간 길이
        int minLost = Integer.MAX_VALUE;

        for (int i = 0; i < N; i++) {
            int a = intervals[i][0];
            int b = intervals[i][1];
            int lost = 0;
            for (int t = a; t < b; t++) {
                if (cover[t] == 1) {  // 이 시간에 나만 일하고 있었다!
                    lost++;
                }
            }
            minLost = Math.min(minLost, lost);
        }

        System.out.println(totalUnion - minLost);
    }
}