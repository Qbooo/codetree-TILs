import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String a = s.nextLine();
        String b = s.nextLine();

        boolean ex = true;

        while (ex) {
            ex = false; // while 루프 안에서 초기화 (중요!)

            for (int i = 0; i <= a.length() - b.length(); i++) {
                if (a.substring(i, i + b.length()).equals(b)) {
                    a = a.substring(0, i) + a.substring(i + b.length());
                    ex = true; // 일치했으므로 다음 while 반복 허용
                    break;
                }
            }
        }

        System.out.println(a);
    }
}
