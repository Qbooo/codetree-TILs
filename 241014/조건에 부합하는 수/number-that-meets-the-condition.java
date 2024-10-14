import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        for(int i = 1; i <= a; i++){
            if(!(i%2 == 0 && i%4 != 0)){
                if(!((i/8)%2 == 0)){
                    if(!(i%7 < 4)){
                        System.out.print(i+" ");
                    }
                }
            }

        }
    }
}