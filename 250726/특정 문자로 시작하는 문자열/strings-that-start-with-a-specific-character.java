import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        s.nextLine();
        int cnt = 0;
        double avg = 0;
        double sum = 0;

        String[] words = new String[n];

        for(int i = 0; i < n; i++){
            words[i] = s.nextLine();
        }

        char w = s.next().charAt(0);

        for(int i = 0 ; i < n; i++){
            if(words[i].charAt(0) == w){
                cnt++;
                sum += words[i].length();
            }
        }
        avg = sum/cnt;

        System.out.printf("%d %.2f",cnt, avg);


    }
}