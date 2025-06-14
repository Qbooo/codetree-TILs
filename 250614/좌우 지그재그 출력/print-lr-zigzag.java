import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int cnt = 1;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(i%2==0){
                    System.out.print(cnt + " ");
                    cnt++;
                    if(j==n-1){
                        cnt = cnt + n - 1;
                    }
                }
                else{
                    System.out.print(cnt + " ");
                    cnt--;
                    if(j==n-1){
                        cnt = cnt + n + 1;
                    }
                }

            }
            System.out.println();
        }
    }
}