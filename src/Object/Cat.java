package Object;
import java.util.Scanner;

public class Cat {
    String color;
    String name;
    float age;

    Cat(String c, float age){

    }
    void print(){

    }
}

public class AboutCat{
    Scanner sc = new Scanner(System.in);
    Cat c = new Cat();
    c.color = "Black";
    String Name = sc.nextLine();
    c.name = Name;

}
