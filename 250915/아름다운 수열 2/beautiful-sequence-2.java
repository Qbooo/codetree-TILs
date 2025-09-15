import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++)
            A[i] = sc.nextInt();
        int[] B = new int[M];
        for (int i = 0; i < M; i++)
            B[i] = sc.nextInt();
        // Please write your code here.
        int cnt = 0;
        int[] xB = new int [M];
        for(int i = 0; i <= N - M; i++){
            int xCnt = 0;
            for(int j = i; j < i + M; j++){
                
                for(int x = 0; x < M; x++){
                    
                    if(A[j] == B[x]){
                        if(xB[x] == 1)continue;
                        else{
                            xB[x] = 1;
                            xCnt++;
                        }
                    }
                }
            }
            if(xCnt == M)cnt++;
            for(int x = 0; x < M; x++){
                xB[x] = 0;
            }
        }

        System.out.print(cnt);


    }
}