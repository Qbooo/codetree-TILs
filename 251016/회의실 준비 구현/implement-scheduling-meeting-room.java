import java.util.*;

class Plan implements Comparable<Plan> {
    int startTime;
    int endTime;

    public Plan(int startTime, int endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    @Override
    public int compareTo(Plan other) {
        // 끝 시간을 기준으로 정렬, 끝 시간이 같으면 시작 시간 기준
        if (this.endTime != other.endTime) {
            return this.endTime - other.endTime;
        }
        return this.startTime - other.startTime;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Plan> plans = new ArrayList<>();

        // 입력 받기
        for (int i = 0; i < n; i++) {
            int s = sc.nextInt();
            int e = sc.nextInt();
            plans.add(new Plan(s, e));
        }

        // 끝 시간을 기준으로 정렬
        Collections.sort(plans);

        // 최대 회의 수 계산
        int count = 0;
        int lastEndTime = 0; // 이전 회의의 끝 시간
        for (Plan plan : plans) {
            if (plan.startTime >= lastEndTime) {
                count++; // 회의 선택
                lastEndTime = plan.endTime; // 끝 시간 업데이트
            }
        }

        System.out.println(count);
    }
}