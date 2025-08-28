import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();
        // Please write your code here.

        int[] num = new int[9999];
        int i = 0;

        while(n>0){
            num[i] = n%b;
            n = n/b;
            i++;
        }

        for(int j = i-1; j >= 0; j--){
            System.out.print(num[j]);
        }

    }
}