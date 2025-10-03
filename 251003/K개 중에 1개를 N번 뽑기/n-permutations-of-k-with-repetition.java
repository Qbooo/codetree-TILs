import java.util.*;

public class Main {
    public static int k, n;
    public static ArrayList<Integer> answer = new ArrayList<>();
    public static void printAnswer(){
        for(int i = 0; i < answer.size(); i++){
            System.out.print(answer.get(i)+" ");
        }
        System.out.println();
    }
    public static void choose(int currNum){
        if(currNum == n + 1){
            printAnswer();
            return;
        }
        for(int select = 1; select <= k; select++){
            answer.add(select);
            choose(currNum+1);
            answer.remove(answer.size()-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        k = sc.nextInt();
        n = sc.nextInt();
        // Please write your code here.
        choose(1);
    }
}