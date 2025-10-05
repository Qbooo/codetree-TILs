import java.util.*;

public class Main {
    public static int n, m;
    public static ArrayList<Integer> answer = new ArrayList<>();
    public static void printNums(){
        for(int a : answer){
            System.out.print(a+" ");
        }
        System.out.println();
    }
    public static void choose(int currNum){
        if(currNum == m){
            printNums();
            return;
        }

        for(int i = 1; i <= n; i++){
            if(answer.size() != 0){
                if(answer.get(answer.size()-1) < i){
                    answer.add(i);
                    choose(currNum + 1);
                    answer.remove(answer.size()-1);
                }
            }else{
                answer.add(i);
                choose(currNum + 1);
                answer.remove(answer.size()-1);
            }
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        // Please write your code here.
        choose(0);
    }
}