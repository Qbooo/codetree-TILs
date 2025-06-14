import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언 및 입력
        int n = sc.nextInt();

        // 상하로 반복하여 출력합니다.
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(j % 2 == 0)
                    System.out.print(i + 1);
                else
                    System.out.print(n - i);
            }
            System.out.println();
        }
    }
}
