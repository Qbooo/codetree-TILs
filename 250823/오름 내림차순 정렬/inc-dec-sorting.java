import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = s.nextInt();
        }
        Arrays.sort(arr);
        for(int i = 0; i < n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        Integer[] arr2 = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        Arrays.sort(arr2, Collections.reverseOrder());

        for(int i = 0; i < n; i++){
            System.out.print(arr2[i]+" ");
        }
    }
}