package NestedClass;

interface Animal{
    void sound();
    default void test(){
        System.out.println("The Test is of Animal.");
    }
}

public class Lambda implements Animal {
    public void sound(){
        System.out.println("Animal is houting");
    }
}


class Main3{
    public static void main(String[] args) {
        Animal obj = new Lambda();
        obj.sound();

        Animal obj1 = ()->{
            System.out.println("Animal is making sound");

            obj1.sound();
        };
    }
}