import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner s = new Scanner(System.in);
        String[] f = new String[]{"apple","banana","grape","blueberry","orange"};
        char w = s.next().charAt(0);
        
        int cnt = 0;
        for(int i = 0; i < 5; i++){
            if(f[i].charAt(2) == w || f[i].charAt(3) == w){
                System.out.println(f[i]);
                cnt++;
            }
        }

        System.out.println(cnt);



    }
}