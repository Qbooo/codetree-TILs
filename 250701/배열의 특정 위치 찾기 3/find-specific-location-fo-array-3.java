import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String line = s.nextLine();
        String[] parts = line.split(" ");
        int[] num = new int[parts.length];

        for(int i = 0; i < parts.length; i++){
            num[i] = Integer.parseInt(parts[i]);
        }

        int point = -1;
        for (int i = 0; i < num.length; i++) {
            if (num[i] == 0) {
                point = i;
                break;
            }
        }

        if (point >= 3) {
            int sum = num[point - 3] + num[point - 2] + num[point - 1];
            System.out.println(sum);
        } else {
            System.out.println("0 앞에 3개 숫자가 없음");
        }
    }
}
