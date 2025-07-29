import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner s = new Scanner(System.in);

        String a = s.nextLine();
        String b = s.nextLine();
        int cnt = 0;

        while(true){
            a = a.charAt(a.length()-1) + a.substring(0,a.length()-1);
            cnt++;
            if(a.equals(b)){
                System.out.print(cnt);
                break;
            }
            if(cnt > a.length()){
                System.out.print("-1");
                break;
            }
        }


    }
}