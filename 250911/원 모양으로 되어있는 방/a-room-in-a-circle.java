import java.util.Scanner;
public class Main {
    public static int dis(int i, int j, int n){
        if(j - i >= 0){
            return j - i;
        }else{
            return n + (j - i);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        // Please write your code here.
        int min = Integer.MAX_VALUE;

        for(int i = 0; i < n; i++){
            int sum = 0;
            for(int j = 0; j < n; j++){
                sum += dis(i, j, n)*arr[j];
            }
            min = Math.min(min, sum);
        }

        System.out.print(min);
    }
}