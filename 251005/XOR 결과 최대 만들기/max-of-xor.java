import java.util.*;

public class Main {
    public static ArrayList<Integer> answer = new ArrayList<>();
    public static int n, m;
    public static int[]A = new int[20];
    public static int max = 0;
    public static int calcul(){
        int xor = 0;
        for(int a : answer){
            xor = xor ^ a;
        }
        return xor;
    }
    public static void choose(int currNum){
        if(currNum == m){
            int xor = calcul();
            max = Math.max(max, xor);
            return;
        }

        for(int i = 0; i < A.length; i++){
            answer.add(A[i]);
            choose(currNum+1);
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
        choose(0);

        System.out.print(max);
    }
}