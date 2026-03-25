package Inheritance;
class Animal extends Object{
    String name;
    void sound(){
        System.out.println("Animal makes Sound");
    }

    public String toString(){
        return name;
    }
}

class Dog extends Animal{
    int age;
    void sound(){
        System.out.println("Dog is Barking");
    }

    public String toString(){
        return name + " " + age;
    }
}
class GerSep extends Dog{
    void sound(){
        System.out.println("German sephard is barking.");
    }
}
public class Overriding {
    static void main() {
        Animal Leo = new Dog();
        Animal Leo1 = new GerSep();
        Leo.sound();
        Leo1.sound();
        Dog a = new Dog();
        System.out.println(a.getClass());
        a.name = "Puppy";
        a.age = 12;
        System.out.println(a.toString());
    }
}
