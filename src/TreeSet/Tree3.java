package TreeSet;

import java.util.HashMap;

public class Tree3 {
    static void main() {
        HashMap<Integer, String> mp = new HashMap<>();
        mp.put(10, "Ashwani");
        mp.put(5, "Priyanka");
        mp.put(61, "Piyush");
        mp.put(15, "Kashis");
        mp.put(2, "Aryan");

        System.out.println(mp);
        System.out.println(mp.get(10));
        mp.remove(61);
        System.out.println(mp);
    }
}
