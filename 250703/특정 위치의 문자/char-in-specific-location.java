import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner s = new Scanner(System.in);
        char[] letter = {'L', 'E', 'B', 'R', 'O', 'S'};

        char x = s.next().charAt(0);

        for(int i = 0; i < 7; i++){
            if(i == 6){
                System.out.print("None");
                break;
            }
            if(letter[i] == x){
                System.out.print(i);
                break;
            }
        }

    }
}