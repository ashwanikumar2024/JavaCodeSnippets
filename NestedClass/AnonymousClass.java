package NestedClass;

public class AnonymousClass {
    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Test {
    public static void main(String[] args) {
        AnonymousClass a = new AnonymousClass() {      //it is like creating a different class of reference type AnonymousClass which is extended by class AnonymousClass.
            int age = 30;
            void sound() {
                super.sound();
                System.out.println(age);
            }
        };
        a.sound();
    }
}
