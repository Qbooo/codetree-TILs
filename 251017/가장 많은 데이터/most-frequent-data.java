import java.util.*;
public class Main {
    public static HashMap<String, Integer> m = new HashMap<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = 0;
        String[] arr = new String[n];
        String maxSt = "";
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }
        // Please write your code here.
        for(int i = 0; i < n; i++){
            m.put(arr[i], m.getOrDefault(arr[i], 0) + 1);
            if( max < m.getOrDefault(arr[i], 0)){
                max = m.getOrDefault(arr[i], 0);
                maxSt = arr[i];
            }
        }

        String s = maxSt.toString();
        System.out.print(m.get(s));
    }
}