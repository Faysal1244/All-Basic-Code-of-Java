package Linked_List;

import java.util.LinkedList;

public class List {
    public static void main(String[] args) {
        LinkedList<String> CountryNames = new LinkedList<>();

        CountryNames.add("Bangladesh");
        CountryNames.add("Afghanistan");
        CountryNames.add("Pakistan");
        CountryNames.add("India");
        CountryNames.add("Japan");

//        CountryNames.add(6,"Nepal");
        CountryNames.addFirst("Australia");

//        CountryNames.remove("Japan");
//        CountryNames.remove(0);
//        CountryNames.removeFirst();
//        CountryNames.removeLast();


//        System.out.println(CountryNames);


        for (String country: CountryNames) {
            System.out.println(country);
        }

        System.out.println("Size of the List :"+CountryNames.size());

        System.out.println("First Element : "+CountryNames.getFirst());
        System.out.println("Last Element : "+CountryNames.getLast());

    }
}
