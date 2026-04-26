package Exception;
public class Try {
    static void main() {
        try{
            System.out.println(12/0);
        }catch(ArithmeticException obj){
            System.out.println(obj);
        }
    }
}
