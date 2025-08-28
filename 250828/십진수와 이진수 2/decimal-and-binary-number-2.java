import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String binary = sc.next();
        // Please write your code here.

        int n = binary.length();
        int num = 0;
        for(int i = 0; i < n; i++){
            num = num * 2 + (binary.charAt(i) - '0');
        }
        num = num * 17;
        int[] ss = new int[9999];
        int x = 0;
        while(num > 0){
            ss[x] = num%2;
            num = num/2;
            x++;
        }

        for(int i = x - 1; i >= 0; i--){
            System.out.print(ss[i]);
        }

    }
}