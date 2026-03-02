package Object;

public class MyString {
    public static void main(MyString[] args) {
        String str = "Hello,World";
        String str1 = new String();
        System.out.println(str1);
        str1 = str;
        System.out.println(str1);
    }
}
