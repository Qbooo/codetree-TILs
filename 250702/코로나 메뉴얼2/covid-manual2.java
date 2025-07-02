import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner s = new Scanner(System.in);
        char[] sym = new char[3];
        int[] cel = new int[3];
        int[] ho = new int[4];

        for(int i = 0; i < 3; i++){
            sym[i] = s.next().charAt(0);
            cel[i] = s.nextInt();


        }

        for(int i = 0; i < 3; i++){
            if(sym[i] == 'Y' && cel[i] >= 37){
                ho[0]++;
            }else if(sym[i] == 'N' && cel[i] >= 37){
                ho[1]++;
            }else if(sym[i] == 'Y' && cel[i] < 37){
                ho[2]++;
            }else{
                ho[3]++;
            }
        }

        for(int i = 0; i < 4; i++){
            System.out.print(ho[i]+" ");
        }

        if(ho[0]>=2){
            System.out.print("E");
        }

    }
}