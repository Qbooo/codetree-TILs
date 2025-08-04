import java.util.Scanner;
public class Main {
    public static String check(String a){
        int cnt = 0;
        for(int i = 0; i < a.length(); i++){
            for(int j = i; j < a.length(); j++){
                if(a.charAt(i) != a.charAt(j)){
                    cnt++;
                }
            }
        }
        if(cnt > 0){
            return "Yes";
        }
        return "No";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        // Please write your code here.
        System.out.print(check(A));
    }
}