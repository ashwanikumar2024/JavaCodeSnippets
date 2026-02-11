import java.util.*;
public class Array2D {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int [][]arr = new int[n][n];
// Pri-Define Array
        //int [][]arr1 = new int[][]{{1,2,3}, {4,5,6}, {8,5,2}};
//
       //for(int i=0; i<arr1.length; i++){
            //for(int j=0; j< arr1.length; j++){
                //System.out.print(arr1[i][j] + " ");
            //}System.out.println();
       // }
//        for(int []a  : arr1){
//            for(int x: a){
//                System.out.print(x + " ");
//            }
//        }

// Array by user
        int [][]arr = new int[3][];

        for(int i=0; i<arr.length; i++){
            arr[i] = new int[sc.nextInt()];
            for(int j = 0; j<arr[i].length; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        for(int []a  : arr){
            for(int x: a){
                System.out.print(x + " ");
            }
        }
    }
}
