import java.util.*;
public class Array {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        //int n = sc.nextInt();
        int []arr = new int[sc.nextInt()];

        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        printArray(arr);
    }
    static void printArray(int []arr){
        for(int x: arr){
            System.out.print(x+" ");
        }
    }
}
