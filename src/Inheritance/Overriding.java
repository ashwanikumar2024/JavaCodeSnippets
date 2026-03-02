package Inheritance;
class Animal{
    void sound(){
        System.out.println("Animal makes Sound");
    }
}

class Dog extends Animal{
    void sound(){
        System.out.println("Dog is Barking");
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
    }
}
