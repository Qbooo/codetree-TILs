import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] cnt = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int num = 0;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(i > j){
                    System.out.print("  ");
                }
                else{
                    System.out.print(cnt[num%9]+" ");
                    num++;
                }
            }
            System.out.println();
        }
    }
}