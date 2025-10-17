import java.util.*;
public class Main {
    public static TreeMap<String, Integer> tm = new TreeMap<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }
        // Please write your code here.
        for(int i = 0; i < n; i++){
            tm.put(arr[i], tm.getOrDefault(arr[i], 0) + 1);
        }

        for(Map.Entry<String, Integer> entry : tm.entrySet()){
            System.out.printf("%s %.4f", entry.getKey(), (double)entry.getValue()/n * 100);
            System.out.println();
        }


    }
}