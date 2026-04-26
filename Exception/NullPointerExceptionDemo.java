class Test {
    int x = 10;
}

public class NullPointerExceptionDemo {
    public static void main(String[] args) {
        try {
            Test obj = null;
            System.out.println(obj.x);  // This will cause exception
        } catch (NullPointerException obj) {
            System.out.println("Exception caught: " + obj);
        } finally {
            System.out.println("Finally block executed");
        }

        System.out.println("Program executed successfully");
    }
}
}