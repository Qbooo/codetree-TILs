import java.util.*;
class Person{
    String name;
    int height;
    double weight;

    public Person(String name, int height, double weight){
        this.name = name;
        this.height = height;
        this.weight = weight;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5;
        String[] names = new String[n];
        int[] heights = new int[n];
        double[] weights = new double[n];
        Person[] p = new Person[n];
        for (int i = 0; i < n; i++) {
            names[i] = sc.next();
            heights[i] = sc.nextInt();
            weights[i] = sc.nextDouble();
            p[i] = new Person(names[i], heights[i], weights[i]);
        }
        // Please write your code here.
        Arrays.sort(p, new Comparator<Person>() {
            @Override
            public int compare(Person a, Person b){
                return a.name.compareTo(b.name);
            }
        });
        System.out.println("name");
        for(int i = 0; i < n; i++){
            System.out.println(p[i].name+" "+p[i].height+" "+p[i].weight);
        }
        System.out.println();
        Arrays.sort(p, new Comparator<Person>() {
            @Override
            public int compare(Person a, Person b){
                return b.height - a.height;
            }
        });
        System.out.println("height");
                for(int i = 0; i < n; i++){
            System.out.println(p[i].name+" "+p[i].height+" "+p[i].weight);
        }
    }
}