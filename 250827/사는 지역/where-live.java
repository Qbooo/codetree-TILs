import java.util.*;
class Person{
    String name;
    String addresse;
    String region;

    public Person(String name, String addresse, String region){
        this.name = name;
        this.addresse = addresse;
        this.region = region;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] names = new String[n];
        String[] addresses = new String[n];
        String[] regions = new String[n];
        for (int i = 0; i < n; i++) {
            names[i] = sc.next();
            addresses[i] = sc.next();
            regions[i] = sc.next();
        }
        // Please write your code here.
        Person[] p = new Person[n];

        for(int i = 0; i < n; i++){
            p[i] = new Person(names[i], addresses[i], regions[i]);
        }

        String[] search = new String[n];
        for(int i = 0; i < n; i++){
            search[i] = names[i];
        }
        Arrays.sort(search, Collections.reverseOrder());
        for(int i = 0; i < n; i++){
            if(search[0].equals(names[i])){
                System.out.println("name "+p[i].name);
                System.out.println("addr "+p[i].addresse);
                System.out.println("city "+p[i].region);
            }
        }

    }
}