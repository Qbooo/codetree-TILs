import java.util.Scanner;
public class Main {
    public static boolean ssn(int n){
        String w = Integer.toString(n);
        for(int i = 0; i < w.length(); i++){
            if(w.charAt(i) == '3' || w.charAt(i) == '6' || w.charAt(i) == '9'){
                return true;
            }
        }
        return false;
    }
    public static boolean three(int n){
        if(n%3 == 0){
            return true;
        }
        return false;
    }
    public static int count(int a, int b){
        int cnt = 0;
        for(int i = a; i <= b; i++){
            if(three(i) == true){
                cnt++;
            }else if(ssn(i) == true){
                cnt++;
            }
        }
        return cnt;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        // Please write your code here.
        System.out.print(count(A, B));
    }
}