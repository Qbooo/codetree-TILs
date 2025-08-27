import java.util.*;
class Nums implements Comparable<Nums>{
    int num;
    int idx;
    int order;

    public Nums(int num, int idx){
        this.num = num;
        this.idx = idx;
    }

    @Override
    public int compareTo(Nums n){
        if(this.num == n.num){
            return this.idx - n.idx;
        }
        return this.num - n.num;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        Nums[] ns = new Nums[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
            ns[i] = new Nums(arr[i], i);
        }
        // Please write your code here.
        Arrays.sort(ns);
        for(int i = 0; i < n; i++){
            ns[i].order = i+1;
        }
        Arrays.sort(ns, new Comparator<Nums>(){
            @Override
            public int compare(Nums a, Nums b){
                return a.idx - b.idx;
            }
        });
        for(int i = 0; i < n; i++){
            System.out.print(ns[i].order+" ");
        }
    }
}