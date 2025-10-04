import java.util.*;
public class Main {
    public static int k, n;
    public static ArrayList<Integer> answer = new ArrayList<>();
    public static void printNum(){
        for(int i = 0; i < answer.size(); i++){
            System.out.print(answer.get(i) + " ");
        }
        System.out.println();
    }
    public static void choose(int currNum) {
    if(currNum == n + 1) {
        printNum();
        return;
    }
    for(int i = 1; i <= k; i++){
        if(answer.size() >= 2 && 
           answer.get(answer.size() - 1) == i && 
           answer.get(answer.size() - 2) == i){
            continue;  // 연속 3개가 같으면 스킵
        }
        
        answer.add(i);
        choose(currNum + 1);
        answer.remove(answer.size() - 1);
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