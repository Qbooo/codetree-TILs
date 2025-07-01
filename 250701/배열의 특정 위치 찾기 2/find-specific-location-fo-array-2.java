import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner s = new Scanner(System.in);

        String line = s.nextLine();
        String[] part = line.split(" ");
        int[] num = new int[part.length];

        for(int i = 0; i < part.length; i++){
            num[i] = Integer.parseInt(part[i]);
        }

        int even = num[1]+num[3]+num[5]+num[7]+num[9];
        int odd = num[0]+num[2]+num[4]+num[6]+num[8];

        System.out.println(Math.abs(even - odd));
    }
}