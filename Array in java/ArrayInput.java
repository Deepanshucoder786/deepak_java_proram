import java.util.Arrays;
import java.util.Scanner;
 
    
public class ArrayInput {
    static void printArray(int[] arr){
         for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

    }
    public static void main(String[] args) {
        
        // Scanner sc=new Scanner(System.in);
        // System.out.println("enter the array size");
        // int n=sc.nextInt();
        int[] arr=new int[4];
        arr[0]=1;
        arr[1]=4;
        arr[2]=3;
        arr[3]=5;
        // System.out.println("enter the element of array");
        // for(int i=0;i<arr.length;i++){
        //     arr[i]=sc.nextInt();
        // }
        // System.out.println("before copid value");
       printArray(arr);
        int[] arr_2=Arrays.copyOf(arr, arr.length);//arr.clone();
        System.out.println("after copid value");
        printArray(arr_2);
        //changing some value of arr_2
        arr_2[0]=0;
        arr_2[1]=0;
        System.out.println("original arr after arr-2 ");
        printArray(arr);
        System.out.println("copid array_2 after changing arr_2 ");
        printArray(arr_2);

    }
    
}
