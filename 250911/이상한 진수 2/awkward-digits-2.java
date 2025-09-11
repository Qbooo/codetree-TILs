import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        // Please write your code here.
        char[] aa = a.toCharArray();
        int max = 0;

        for(int i = 1; i < aa.length; i++){
            char[] b = aa.clone();
            if(b[i] == '0'){
                b[i] = '1';
            }else{
                b[i] = '0';
            }
            String bb = String.valueOf(b);
            int num = Integer.parseInt(bb, 2);
            max = Math.max(max, num);
        }

        System.out.print(max);

    }
}