import java.util.Scanner;
public class Main {
    public static void print(int n){
        int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9}; 
        int x = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                int y = x % 9;
                System.out.print(num[y]+ " ");
                x++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        print(n);
    }
}