package Object;

class Student{
    String Name;
    int age;
    float gpa;

    public void print(){
        System.out.println(Name);
        System.out.println(age);
        System.out.println(gpa);
    }
}
public class obj2 {
    public static void main(String[] args){
        Student s1 = new Student();
        s1.Name = "Ashwani";
        s1.age = 20;
        s1.gpa = 8.84f;
//        System.out.println(s1.Name);
//        System.out.println(s1.age);
//        System.out.println(s1.gpa);
        s1.print();
    }
}
