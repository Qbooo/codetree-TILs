import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        // 입력 받기
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int end = n;
        List<Integer> list = new ArrayList<>();
        
        
        while(true){
            int max = -1;
            int idx = -1;
            for(int i = 0; i <end; i++){
                if(max < arr[i]){
                    max = arr[i];
                    idx = i;
                }
            
                
            } 
            list.add(idx + 1);
                if(idx == 0){
                    break;
                }
                end = idx;
        }

        for(int num : list){
            System.out.print(num+" ");
        }

    }
}
