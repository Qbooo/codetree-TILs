import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] x = new char [101];
        for (int i = 0; i < n; i++) {
            int position = sc.nextInt();
            char ch = sc.next().charAt(0);
            x[position] = ch;
        }
        // Please write your code here.
        int max = 0;
        for(int i = 0; i < 100; i++){
            int dis = 0;
            if(x[i] != 0){
                for(int j = i; j < 101; j++){
                    int gCnt = 0;
                    int hCnt = 0;
                    if(x[j] != 0){
                        for(int a = i; a <= j; a++){
                            if(x[a] == 'G'){
                                gCnt++;
                            }else if(x[a] == 'H'){
                                hCnt++;
                            }
                        }
                        if(gCnt > 0 && hCnt == 0 || hCnt > 0 && gCnt == 0 || hCnt == gCnt){
                        dis = j - i;
                        max = Math.max(max, dis);
                    }
                }
                    


                }
            }

        }

        System.out.print(max);
    }
}