import java.util.*;

public class Main {
    static ArrayList<Integer>[] graph; // 인접 리스트
    static boolean[] visited;          // 방문 체크
    static int count = 0;              // 도달 가능한 정점 수

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 정점 수
        int m = sc.nextInt(); // 간선 수

        graph = new ArrayList[n + 1];
        visited = new boolean[n + 1];

        // 인접 리스트 초기화
        for (int i = 1; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }

        // 간선 입력 (양방향)
        for (int i = 0; i < m; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            graph[u].add(v);
            graph[v].add(u);
        }

        // DFS 시작 (1번 정점에서 출발)
        dfs(1);

        // 시작점(1번)은 제외해야 하므로 -1
        System.out.println(count - 1);
    }

    static void dfs(int node) {
        visited[node] = true;
        count++;

        for (int next : graph[node]) {
            if (!visited[next]) {
                dfs(next);
            }
        }
    }
}
