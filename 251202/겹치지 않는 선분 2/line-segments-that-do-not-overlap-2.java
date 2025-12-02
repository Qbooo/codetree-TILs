import java.io.*;
import java.util.*;

public class Main {
    static class Seg {
        int a, b;
        Seg(int a, int b) { this.a = a; this.b = b; }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine().trim());
        Seg[] segs = new Seg[N];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            segs[i] = new Seg(a, b);
        }

        // a 기준으로 정렬
        Arrays.sort(segs, Comparator.comparingInt(s -> s.a));

        int[] b = new int[N];
        for (int i = 0; i < N; i++) b[i] = segs[i].b;

        // prefix max
        int[] prefMax = new int[N];
        prefMax[0] = b[0];
        for (int i = 1; i < N; i++) prefMax[i] = Math.max(prefMax[i-1], b[i]);

        // suffix min
        int[] sufMin = new int[N];
        sufMin[N-1] = b[N-1];
        for (int i = N-2; i >= 0; i--) sufMin[i] = Math.min(sufMin[i+1], b[i]);

        int cnt = 0;
        for (int i = 0; i < N; i++) {
            boolean okLeft  = (i == 0) ? true : (prefMax[i-1] <= b[i]);
            boolean okRight = (i == N-1) ? true : (sufMin[i+1] >= b[i]);
            if (okLeft && okRight) cnt++;
        }

        System.out.println(cnt);
    }
}
