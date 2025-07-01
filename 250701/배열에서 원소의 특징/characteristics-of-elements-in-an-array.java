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
        int point = 0;

        for(int i = 0; i < num.length; i++){
            if(num[i]%3 == 0){
                point = i;
                break;
            }
        }

        System.out.println(num[point-1]);
    }
}