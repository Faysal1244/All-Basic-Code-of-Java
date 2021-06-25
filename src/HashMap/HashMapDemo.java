package HashMap;

import java.util.HashMap;

@SuppressWarnings("MismatchedQueryAndUpdateOfCollection")
public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> Customer = new HashMap<Integer,String>();

        Customer.put(101,"Faysal");
        Customer.put(102,"Rahim");
        Customer.put(103,"Karim");
        Customer.put(104,"Hashim");

        System.out.println(Customer.get(102));

    }
}
