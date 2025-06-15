import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner s = new Scanner(System.in);
        int start = s.nextInt();
        int end = s.nextInt();
        int nCnt = 0;
        int cnt = 0;
        for(int i = start; i <= end; i++){
            nCnt = 0;
            for(int j = 1; j <= i; j++){
                if(i%j == 0){
                    nCnt++;
                }
            }
            if(nCnt == 3){
                cnt++;
            }
            
        }
        System.out.println(cnt);

    }
}