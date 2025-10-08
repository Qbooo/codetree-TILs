import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] blocks = new int[n];
        for (int i = n-1; i >= 0; i--) {
            blocks[i] = sc.nextInt();
        }
        int s1 = sc.nextInt();
        int e1 = sc.nextInt();
        int s2 = sc.nextInt();
        int e2 = sc.nextInt();
        // Please write your code here.

        for(int i = e1; i <= s1; i++){
            blocks[i] = 0;
        }
        System.out.print("뺌1>>>");
        for(int i = 0; i < n; i ++){
            System.out.print(blocks[i]+" ");
        }
        System.out.println();
        for(int i = 0; i < n - (e1 - s1 + 1); i++){
            if(blocks[i] == 0){
                int j = i;
                while(blocks[i] == 0){
                    blocks[j] = blocks[j+1];
                    j++;
                }
            }
        }

        n =  n - (e1 - s1 + 1);
        System.out.print("뺌1111>>>");
        for(int i = 0; i < n; i ++){
            System.out.print(blocks[i]+" ");
        }
        System.out.println();

        for(int i = e2; i <= s2; i++){
            blocks[i] = 0;
        }
        System.out.print("뺌2>>>>");
        for(int i = 0; i < n; i ++){
            System.out.print(blocks[i]+" ");
        }
        System.out.println();
        for(int i = 0; i < n - (e2 - s2 + 1); i++){
            if(blocks[i] == 0){
                int j = i;
                while(blocks[i] == 0){
                    blocks[j] = blocks[j+1];
                    j++;
                }
            }
        }
        n = n - (e2 - s2 + 1);

        System.out.print("뺌222222>>>>");
        for(int i = 0; i < n; i ++){
            System.out.print(blocks[i]+" ");
        }
        System.out.println();

            System.out.println(n);

        for(int i = n-1; i >= 0; i--){
            System.out.println(blocks[i]);
        }
        

    }
}