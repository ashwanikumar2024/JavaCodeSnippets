import java.util.*;
public class InputInJava {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int a = sc.nextInt();
        char c = sc.next().charAt(0);

        System.out.println(str);
        System.out.println(a);
        System.out.println(c);
    }
}
