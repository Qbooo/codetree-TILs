import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int cul = 0;
        int N = sc.nextInt();
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
        }
        // Please write your code here.

        for(int i = 0; i < N; i++){
            cul = cul + a[i];
            max = cul;
            if(cul < 0){
                cul = 0;
            }
        }

        System.out.print(max);
    }
}