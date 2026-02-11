import java.util.Scanner;
public class VarArg {
    public static void main(String[] args){
        printInt( 1,2,3,4,5,6);
    }
    static void printInt(int ...args){
        for(int x: args){
            System.out.print(x + " ");
        }System.out.println();
    }
}
