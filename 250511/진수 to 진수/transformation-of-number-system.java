import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        String N = sc.next();
        // Please write your code here.
        int num = 0;
        int len = N.length();
        for(int i = 0; i < len; i++){
            num = num * A + (N.charAt(i)-'0');
        }
        int[] nNum = new int[20];
        int i = 0;
        while(num>0){
            nNum[i] = num % B; 
            num = num / B;
            i++;
        }
        
        for(int j = i - 1; j >= 0; j--){
            System.out.print(nNum[j]);
        }

    }
}