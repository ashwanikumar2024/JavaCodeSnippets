package Object;

class Printing{
    String Name;
    int age;
    float gpa;

    public void print(){
        System.out.println("Empety one");
    }
    public void print(int a, float g){
        gpa = g;
        age = a;
        System.out.println(age +" "+gpa);
    }
    public void print( String k , float g){
        gpa = g;
        Name = k;
        System.out.println(age +" "+gpa);
    }
}
public class funOverloading {
    public static void main(String[] args){
        Printing s1 = new Printing();

    }

}
