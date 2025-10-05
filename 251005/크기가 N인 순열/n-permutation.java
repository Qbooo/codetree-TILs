import java.util.*;
public class Main {
    public static int n;
    public static boolean[] visited = new boolean[9];
    public static ArrayList<Integer> ans = new ArrayList<>();
    public static void printNum(){

            for(int a : ans){
                System.out.print(a+" ");
            }
            System.out.println();
        
    }
    public static void choose(int currNum){
        if(currNum == n){
            printNum();
            return;
        }

        for(int i = 1; i <= n; i++){
            if(visited[i]){
                continue;
            }else{
                visited[i] = true;
                ans.add(i);

                choose(currNum + 1);

                ans.remove(ans.size() - 1);
                visited[i] = false;
            }
        }
        return;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        // Please write your code here.
        choose(0);
    }
}