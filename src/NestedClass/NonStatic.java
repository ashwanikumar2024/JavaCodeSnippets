package NestedClass;

public class NonStatic {
//    static  int a = 40;
//    int b = 20;
    int x;

    class InnerClass{
        void print(){
//            System.out.println(a);
//            System.out.println(b);
            System.out.println(x);
        }
    }

    NonStatic(int k) {
        x = k;
    }
}

class Main2{
    static void main() {
        NonStatic outerObj = new NonStatic(85);
        NonStatic.InnerClass innerObj = outerObj. new InnerClass();
        innerObj.print();

        NonStatic outerObj2 = new NonStatic(79);
        NonStatic.InnerClass innerObj2 = outerObj2. new InnerClass();
        innerObj2.print();
    }
}
