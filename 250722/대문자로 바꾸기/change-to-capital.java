import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner s = new Scanner(System.in);

        char[][] alpha = new char[5][3];

        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 3; j++){
                alpha[i][j] = Character.toUpperCase(s.next().charAt(0));
            }
        }

         for(int i = 0; i < 5; i++){
            for(int j = 0; j < 3; j++){
                System.out.print(alpha[i][j]+" ");
            }
            System.out.println();
        }
    }
}