package Object;

class Student1{
    String Name;
    int age;
    float gpa;

    Student1(String n, int a, float g){
        System.out.println("Student obj created");
        Name = n;
        age = a;
        gpa = g;
    }
    Student1(){
        System.out.println("constructor over loading");
    }
    Student1(Student1 obj){
        System.out.println("Copy of the Student1 constructor");
    }
}
public class Constructor {
    public static void main(String[] args){
        Student1 s1 = new Student1("Ashwani", 20, 8.8f);
    }
}
