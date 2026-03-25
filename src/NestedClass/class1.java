package NestedClass;

public class class1 {
    static int x = 29;
    int y = 20;
    static class StaticClass{
        void print(){
            System.out.println("NestedClass!!");
        }
    }
}

class Main{
    public static void main(String[] args) {
        class1.StaticClass innerObj = new class1.StaticClass();
        innerObj.print();
    }
}


// static nested class declared by class
// (outer class).(inner class) obj = new (outer class).(inner class);
// we can only access the property of static variable inside the static class