import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        int i = 0;
        int[] two = new int[20];
        if( n == 0){
            System.out.print("0");
        }
        while(n > 0){
            two[i] = n % 2;
            n = n / 2; 
            i++;
        }

        for(int j = i-1; j >= 0; j--){
            System.out.print(two[j]);
        }

    }
}