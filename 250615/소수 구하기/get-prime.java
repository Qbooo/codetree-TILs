import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int nCnt = 0;
        for(int i =1; i <= n; i++){
            nCnt = 0;
            for(int j = 1; j <= i; j++){
                if(i%j==0){
                    nCnt++;
                }
            }
            if(nCnt == 2){
                System.out.print(i+" ");
            }
        }
    }
}