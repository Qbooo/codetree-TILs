import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int count = 0;
        for(int i = 0; i < 2 * n; i++){
            if(i%2==0){
                count = n - i/2;
            }
            else{
                count = 1 + i/2;
            }

                        // 별 찍기
            for (int j = 0; j < count; j++) {
                System.out.print("* ");
            }
            // 한 줄 끝나면 줄바꿈
            System.out.println();

        }

    }
}