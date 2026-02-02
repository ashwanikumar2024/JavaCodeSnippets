import java.util.*;
    class test{
        static int a=32;
        public static void greet(){
            System.out.println("Hello, LPU");
        }
        public void nonStatic(){
            System.out.println("Helloooo!!!");
        }
    }
    public class Main {
    public static void main(String[] args){
        System.out.println(test.a);
        test.greet();
    }
}
