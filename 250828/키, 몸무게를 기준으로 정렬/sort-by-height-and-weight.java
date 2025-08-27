import java.util.*;
class Person implements Comparable<Person>{
    String name;
    int height;
    int weight;

    public Person(String name, int height, int weight){
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public int compareTo(Person p){
        if(this.height == p.height){
            return p.weight - this.weight;
        }
        return this.height - p.height;
    }

}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Person[] ps = new Person[n];
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int height = sc.nextInt();
            int weight = sc.nextInt();
            // Please write your code here.
            ps[i] = new Person(name, height, weight);
        }

        Arrays.sort(ps);

        for(int i = 0; i < n; i++){
            System.out.println(ps[i].name+" "+ps[i].height+" "+ps[i].weight);
        }

    }
}