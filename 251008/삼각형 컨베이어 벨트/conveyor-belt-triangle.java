import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int[] l = new int[n];
        int[] r = new int[n];
        int[] d = new int[n];
        for (int i = 0; i < n; i++) {
            l[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            r[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            d[i] = sc.nextInt();
        }
        // Please write your code here.

        for(int i = 0; i < t; i++){
            int t1 = l[n-1];
            int t2 = r[n-1];
            int t3 = d[n-1];
            for(int j = n-2; j >= 0; j--){
                l[j+1] = l[j];
                r[j+1] = r[j];
                d[j+1] = d[j];
            }
            l[0] = t3;
            r[0] = t1;
            d[0] = t2;
        }

        for(int i = 0; i < n; i++){
            System.out.print(l[i]+" ");
        }System.out.println();
         for(int i = 0; i < n; i++){
            System.out.print(r[i]+" ");
        }System.out.println();
         for(int i = 0; i < n; i++){
            System.out.print(d[i]+" ");
        }System.out.println();
    }
}