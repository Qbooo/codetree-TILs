import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] tails = new int[300000];
        int mid = 150000;
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            char d = sc.next().charAt(0);
            if(d == 'R'){
                for(int j = mid; j < mid + x; j++){
                    tails[j] = 1;
                    //System.out.println(tails[j]+" "+j);
                }
                mid = mid + x -1;
            }else{
                for(int j = mid; j > mid - x; j--){
                    tails[j] = -1;
                    //System.out.println(tails[j]+" "+j);
                }
                mid = mid - x + 1;
            }
            
        }
        // Please write your code here.

        long countW = 0;
        long countB = 0;

        for(int i = 0; i < 300000; i++){
            if(tails[i] == 1){
                countB++;
            }
            else if(tails[i] == -1){
                countW++;
            }
        }

        System.out.println(countW+" "+countB);
        
    }
}