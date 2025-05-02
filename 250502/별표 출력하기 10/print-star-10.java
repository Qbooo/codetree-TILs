import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int evenCnt = 1;
        int OddCnt = N;
        for(int i = 1; i <= N; i++){
            if(i % 2 == 1){
                for(int j = 1; j <= evenCnt; j++){
                    System.out.print("* ");
                }
                evenCnt++;
            }
            else {
                for(int j = OddCnt; j > 0; j--){
                    System.out.print("* ");
                }
                OddCnt--;
            }
            System.out.println();
        }

       for(int i = 0; i < N; i++){
        if(i%2 == 0){
            for(int j = 1; j <= N/2 + 1 - i/2; j++){
                System.out.print("* ");
            }
        }
        else {
            for(int j = 1; j <= N/2 + 2 + i/2; j++){
                System.out.print("* ");
            }
        }
        System.out.println();
       }
    }
}