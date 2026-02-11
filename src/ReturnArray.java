import java.util.Scanner;
public class ReturnArray {
    public static void main(String[] args){
        int []arr1 = createArray();
        int []arr2 = createArray();
        int []arr3 = createArray();

        printArray(arr1);
        printArray(arr2);
        printArray(arr3);
    }

    static int[] createArray(){
        Scanner sc = new Scanner(System.in);
        int []arr = new int[sc.nextInt()];
        for(int i=0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    static void printArray(int []arr){
        for(int x: arr){
            System.out.println(x);
        }
    }
}
