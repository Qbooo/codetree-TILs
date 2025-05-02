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
        if(N%2 == 1){
            OddCnt = N/2 + 1;
            evenCnt = OddCnt +1;
            for(int i = 1; i <= N; i++){
                if(i%2 == 1){
                    for(int j = 0; j < OddCnt; j++){
                        System.out.print("* ");
                    }
                    OddCnt--;
                }else {
                    for(int j = 0; j < evenCnt; j++){
                        System.out.print("* ");
                    }
                    evenCnt++;
                }
                System.out.println();
            }
        }
        else {
            OddCnt = N/2 + 1;
            evenCnt = OddCnt - 1;
            for(int i = 1; i <= N; i++){
                if(i%2 == 1){
                    for(int j = 0; j < OddCnt; j++){
                        System.out.print("* ");
                    }
                    OddCnt++;
                }
                else{
                    for(int j = 0; j < evenCnt; j++){
                        System.out.print("* ");
                    }
                    evenCnt--;
                }
                System.out.println();
            }
        }
    }
}