package List;

import java.util.ArrayList;
public class Main10 {
    public static void main(String[] args) {
        Main10<String> list = new Main10<>();

        list.add("jaspreet");
        list.add("Arayan");
        list.add("shiddanth");
        list.add("Ashwani");

        System.out.println(list);

        list.remove(0);
        list.remove("Arayan");

        System.out.println(list);

        System.out.println(list.get(0));
        list.set()
    }

}
