package Generic;

public class Generic<T, K> {
    T item;
    K x;
    Generic(T a, K b) {
        this.item=a;
        this.x=b;
    }
    T getValue(){
        return item;
    }
}
class Test{
    public static void main(String[] args) {}
}
class Main1 {
    public static void main(String[] args) {
        Generic<Integer, Test> obj = new Generic<>(125, new Test());
        Generic<String, Double> obj1 = new Generic<>("JAVA", 512.54513);
        Generic<Integer, String> obj3 = new Generic<>(651, "Pri");

        System.out.println(obj.getValue());
        System.out.println(obj1.getValue());
        System.out.println(obj3.getValue());
    }
}
