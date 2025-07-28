import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String w = s.next();
        int q = s.nextInt();

        for(int i = 0; i < q; i++){
            int n = s.nextInt();
            if(n == 1){
                w = w.substring(1) + w.substring(0,1);
                System.out.println(w);
            } else if(n == 2){
                w = w.substring(w.length()-1) + w.substring(0,w.length()-1);
                System.out.println(w);
            } else if(n == 3){
                w = new StringBuilder(w).reverse().toString(); // ✅ 이 부분만 변경
                System.out.println(w);
            }
        }
    }
}
