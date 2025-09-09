import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] A = new int[1000001];
        int[] B = new int[1000001];
        int timeA = 0;
        int timeB = 0;
        
        for (int i = 0; i < n; i++) {
            int t = sc.nextInt();
            char d = sc.next().charAt(0);
            // Please write your code here.
            while(t-- > 0){
                timeA++;
                if(d == 'R'){
                    A[timeA] = A[timeA - 1] + 1;
                }else if(d == 'L'){
                    A[timeA] = A[timeA - 1] - 1;
                }
            }
        }
        
        for (int i = 0; i < m; i++) {
            int t = sc.nextInt();
            char d = sc.next().charAt(0);
            // Please write your code here.
            while(t-- > 0){
                timeB++;
                if(d == 'R'){
                    B[timeB] = B[timeB - 1] + 1;
                }else if(d == 'L'){
                    B[timeB] = B[timeB - 1] - 1;
                }
            }
        }
        int cnt = 0;
        // Please write your code here.
        if(timeA > timeB){
            for(int i = timeB; i <= timeA; i++){
                B[i] = B[timeB];
            }
        }else if(timeB > timeA){
            for(int i = timeA; i <= timeB; i++){
                A[i] = A[timeA];
            }
        }
        for(int i = 1; i < Math.max(timeA, timeB); i++){
            if(A[i-1] != B[i-1] && A[i] == B[i]){
                cnt++;
            }
        }

        System.out.print(cnt);
    }
}