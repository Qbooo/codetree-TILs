import java.util.*;

public class Main {
    public static HashSet<Integer> tm = new HashSet<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        for(int i = 0; i < n; i++){
            String s = sc.next();
            if(s.equals("add")){
                int k = sc.nextInt();
                tm.add(k);
            }else if(s.equals("find")){
                int k = sc.nextInt();
                if(tm.contains(k)){
                    System.out.println("true");
                }else{
                    System.out.println("false");
                }
            }else if(s.equals("remove")){
                int k = sc.nextInt();
                tm.remove(k);
            }

        }
    }
}
