import java.util.*;

public class Main {
    public static ArrayList<Integer> answer = new ArrayList<>();
    public static int n, m;
    public static int[]A = new int[20];
    public static int max = 0;

    public static void choose(int currNum, int xor){
        if(currNum == m){
            max = Math.max(max, xor);
            return;
        }

        for(int i = 0; i < n; i++){
            answer.add(A[i]);
            choose(currNum+1, xor ^ A[i]);
            answer.remove(answer.size()-1);
        }
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        // Please write your code here.
        choose(0, 0);

        System.out.print(max);
    }
}