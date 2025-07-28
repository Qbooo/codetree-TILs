import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner s = new Scanner(System.in);
        String w = s.next();
        int numQ = s.nextInt();
        s.nextLine();

        for(int i = 0; i < numQ; i++){
            int q = s.nextInt();
            if(q == 1){
                int a = s.nextInt();
                int b = s.nextInt();

                char wa = w.charAt(a-1);
                char wb = w.charAt(b-1);
                if(a <= b && b != w.length()){
                    w = w.substring(0,a -1) + wb + w.substring(a,b-1) + wa + w.substring(b,w.length());
                }else if(a > b && a != w.length()){
                    w = w.substring(0,b - 1) + wa + w.substring(b,a-1) + wb + w.substring(a,w.length());
                }else if(a <= b && b == w.length()){
                    w = w.substring(0,a - 1) + wb + w.substring(a,b-1) + wa;
                }else if(a > b && a == w.length()){
                     w = w.substring(0,b - 1) + wa + w.substring(b,a-1) + wb;
                }

                System.out.println(w);

            }
            if(q == 2){
                char x = s.next().charAt(0);
                char y = s.next().charAt(0);
                String r = "";
                for(int j = 0; j < w.length(); j++){
                    if(w.charAt(j) == x){
                        r += y;
                    }
                    else{
                        r += w.charAt(j);
                    }
                }
                w = r;
                System.out.println(w);
            }
        }
    }
}