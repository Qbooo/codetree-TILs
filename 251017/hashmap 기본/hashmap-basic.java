import java.util.*;
public class Main {
    public static HashMap<Integer, Integer> hm = new HashMap<>(); 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        for(int i = 0; i < n; i++){
            String s = sc.next();
            Integer a, b;
            if(s.equals("add")){
                a = sc.nextInt();
                b = sc.nextInt();
                hm.put(a, b);
            }else if(s.equals("remove")){
                a = sc.nextInt();
                hm.remove(a);
            }else if(s.equals("find")){
                a = sc.nextInt();
                if(!hm.containsKey(a))
                    System.out.println("None");
                else
                    System.out.println(hm.get(a));

            }
        }
    }
}