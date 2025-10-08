import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int[] top = new int[n];
        int[] bottom = new int[n];
        for (int i = 0; i < n; i++) {
            top[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            bottom[i] = sc.nextInt();
        }
        // Please write your code here.
        for(int i = 0; i < t; i++){
            int temp1, temp2;
            temp1 = top[n-1];
            temp2 = bottom[n-1];
            for(int j = n-2; j >= 0; j--){
                top[j+1] = top[j];
                 bottom[j+1] = bottom[j];
            }

            top[0] =  temp2;
            bottom[0] = temp1;
        }
        
        for(int i = 0; i < n; i++){
            System.out.print(top[i]+" ");
        }
        System.out.println();
        for(int i = 0; i < n; i++){
            System.out.print(bottom[i]+" ");
        }
    }
}