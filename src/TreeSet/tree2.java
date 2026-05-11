package TreeSet;

import java.util.Comparator;
import java.util.TreeSet;
public class tree2 implements Comparable<tree2> {
    int id ;
    String name;
    int marks;

    tree2(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public String toString() {
        return id + " " + name + " " + marks;
    }

    public int compareTo(tree2 obj) {
        if(id == obj.id){
            return this.marks - obj.marks;
        }
        else{
            return id - obj.id;
        }
    }
}

class NameComparator implements Comparator<tree2> {
    public int compare(tree2 o1, tree2 o2) {
        return o1.name.compareTo(o2.name);
    }
}

class Main9{
    public static void main(String[] args) {
        TreeSet<tree2> set = new TreeSet<>(new NameComparator());
        set.add(new tree2(1, "Ashwani", 80));
        set.add(new tree2(2, "Aryan", 85));
        set.add(new tree2(3, "Priyanka", 100));
        set.add(new tree2(4, "Kashis", 90));
        set.add(new tree2(5, "Piyush", 80));
        System.out.println(set);
    }
}
