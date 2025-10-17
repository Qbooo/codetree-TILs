import java.util.*;

public class Main {
    public static TreeMap<Integer, Integer> tm = new TreeMap<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        for(int i = 0; i < n; i++){
            String s = sc.next();
            if(s.equals("add")){
                int k = sc.nextInt();
                int v = sc.nextInt();
                tm.put(k, v);
            }else if(s.equals("find")){
                int k = sc.nextInt();
                if(tm.containsKey(k)){
                    System.out.println(tm.get(k));
                }else{
                    System.out.println("None");
                }
            }else if(s.equals("remove")){
                int k = sc.nextInt();
                tm.remove(k);
            }else{
                if(tm.isEmpty()){
                    System.out.println("None");
                }else{
                    for(int value : tm.values()) {
                    System.out.print(value + " ");
                    }
                System.out.println();
                }
            }
        }
    }
}
