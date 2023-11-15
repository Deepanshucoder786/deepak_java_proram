import java.util.Scanner;

public class RotateArray {
    static int[] rotate(int[] arr,int k){
       int n=arr.length;
       k=k%n;
       int j=0;
       int[] ans =new int[n];
       for(int i=n-k; i<n ; i++){
        ans[j++]=arr[i];
       }
       for(int i=0; i<n-k; i++){
        ans[j++]=arr[i];
       }
       return ans;
       
    }
    static void swapInArray(int[] arr, int i,int j){
       
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=arr[i];
        arr[j]=temp;
       


    }
    static void reverseArray(int[] arr , int i, int j){
       
        while(i<j){
                swapInArray(arr , i, j);
                i++;
                j--;
  
        }
      }
    static void rotateInpalce(int[] arr, int k ){
        int n=arr.length;
        k=k%n;
        reverseArray(arr, 0 , n-k );
                reverseArray(arr, n-k , n-1 );
        reverseArray(arr, 0 , n-1 );

    }
    static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.println("enter then size of array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter "+n+" element");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter k value");
        int k=sc.nextInt();
        System.out.println("original array");
        printArray(arr);
        int[] ans=rotate(arr, k);
        System.out.println("array after rotation");
        printArray(ans);
    }
    
}
