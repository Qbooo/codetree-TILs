import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner s = new Scanner(System.in);

        int eeCnt = 0;
        int ebCnt = 0;

        String w = s.next();

        for(int i = 0; i < w.length() - 1; i++){
            if(w.substring(i,i+2).equals("ee")){
                eeCnt++;
            }
            if(w.substring(i,i+2).equals("eb")){
                ebCnt++;
            }
            
        }

        System.out.println(eeCnt+" "+ebCnt);



    }
}