import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner s = new Scanner(System.in);

        int cnt2 = 0;
        int cnt = 0;
        while(cnt2 < 3){
            int n = s.nextInt();
            if(n == 2){
                cnt2++;
            }
            cnt++;
        }

        System.out.println(cnt - 1);


    }
}
입력

나의 출력

정답

상세 정보

$0