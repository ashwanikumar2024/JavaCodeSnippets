package Inheritance;
class Person{
    String name;
    int age;
}

class Student extends Person{
    int reg;
    float cgpa;
}

class BtechStd extends Student{
    String Domain;
}

public class inherit1 {
    static void main() {
        BtechStd std = new BtechStd();
        std.name = "Ashwani";
        std.reg = 12410217;
        std.Domain = "FullStack";
        System.out.println(std.name);
        System.out.println(std.Domain);
        System.out.println(std.reg);
    }
}
