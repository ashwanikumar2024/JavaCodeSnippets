package NestedClass;

public class LocalClass {
    static int a = 6;
    int b = 9;
    static void test(){
        int k = 56;
        final int u=48;
        class ClassLocal{
            void print(){
                System.out.println(k+ " " +u+" "+a);
            }
        }

        ClassLocal obj = new ClassLocal();
        obj.print();
    }
}

class Main6{
    static void main() {
        LocalClass obj = new LocalClass();
        obj.test();
    }
}