import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        // Please write your code here.
        int cnt = 0;
        for(int i = 0; i < str.length(); i++){
            int a = str.charAt(i);
            if(a == '('){
                for(int j = i; j < str.length(); j++){
                    int b = str.charAt(j);
                    if(b == ')'){
                        cnt++;
                    }
                }
            }

        }
        System.out.print(cnt);
    }
}