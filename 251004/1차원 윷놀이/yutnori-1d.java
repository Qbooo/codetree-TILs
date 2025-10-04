import java.util.*;

public class Main {
    public static int n, m, k;
    public static int[] nums = new int[12];
    public static int[] chara = new int[4];
    public static int Max = 0;
    public static int cnt = 0;
    public static ArrayList<Integer> answer = new ArrayList<>();
    public static void choose(int currNum){
        if(currNum == n){
            for(int i = 0; i < answer.size(); i++){
                chara[answer.get(i)] += nums[i];
            }
;
            for(int i = 0; i < k; i++){

                if(chara[i] >= m - 1){
                    cnt++;
                }
            }

            Max = Math.max(Max, cnt);
            cnt = 0;
            for(int i = 0; i < k; i++){
                chara[i] = 0;
            }
            return;
        }

        for(int i = 0; i < k; i++){
            answer.add(i);
            choose(currNum + 1);
            answer.remove(answer.size() - 1);
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        k = sc.nextInt();

        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }

        choose(0);

        System.out.print(Max);

        // Please write your code here.
    }
}